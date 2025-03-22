package com.Crazylychee.demo03mysql.optimize;

import com.Crazylychee.demo03mysql.mock.Emergency;
import com.Crazylychee.demo03mysql.mock.mapper.EmergencyMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 测试分片位图索引
 */
@Service
public class TestBitMapIndexInRedis {


    @Autowired
    private EmergencyMapper emergencyMapper;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    // 位反转查找表（每个字节的8位反转）
    private static final byte[] REVERSE_BIT_LOOKUP = new byte[256];

    static {
        for (int i = 0; i < 256; i++) {
            int reversed = 0;
            for (int j = 0; j < 8; j++) {
                reversed = (reversed << 1) | ((i >> j) & 1);
            }
            REVERSE_BIT_LOOKUP[i] = (byte) reversed;
        }
    }


    public void storeEventIds(List<Integer> eventIds, String redisKey) {
        BitSet bitSet = new BitSet();
        int baseId = eventIds.get(0);
        for (int id : eventIds) {
            if (id == 7) continue;
            if (id < 0) throw new IllegalArgumentException("ID不能为负数: " + id);
            bitSet.set(id - baseId);
        }
        // 3. 生成Redis存储结构
        Map<String, Object> shardData = new HashMap<>();
        shardData.put("baseId", baseId);
        byte[] reversedBytes = reverseBitSetBytes(bitSet);
        String bitmapStr = Base64.getEncoder().encodeToString(reversedBytes);
        shardData.put("bitmap", bitmapStr); // 处理位顺序
        shardData.put("count", eventIds.size());
        shardData.put("createTime", System.currentTimeMillis());

        // 4. 使用Hash结构存储分片数据
        redisTemplate.opsForHash().putAll(redisKey, shardData);

    }

    private byte[] reverseBitSetBytes(BitSet bitSet) {
        byte[] originalBytes = bitSet.toByteArray();
        byte[] reversedBytes = new byte[originalBytes.length];
        for (int i = 0; i < originalBytes.length; i++) {
            reversedBytes[i] = REVERSE_BIT_LOOKUP[originalBytes[i] & 0xFF];
        }

        return reversedBytes;
    }


    private static final int TOTAL = 1000000;


    /**
     * 生成按月分片的位图索引
     *
     * @param startYearMonth 格式 "yyyy-MM"
     * @param endYearMonth   格式 "yyyy-MM"
     */
    public void generateMonthlyBitMapIndices(String startYearMonth, String endYearMonth) {
        try {
            // 解析时间范围
            Date startDate = parseYearMonth(startYearMonth);
            Date endDate = parseYearMonth(endYearMonth);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);

            // 循环处理每个月
            while (calendar.getTime().before(endDate) ||
                    isSameMonth(calendar.getTime(), endDate)) {

                // 生成当月键名 如 "event_bitmap:2021-01"
                String redisKey = "event_bitmap:" + formatDate(calendar.getTime(), "yyyy-MM");

                // 获取当月时间范围
                String[] monthRange = getMonthDateRange(calendar.getTime());

                // 查询当月数据
                List<Integer> eventIds = emergencyMapper.selectEventsByCreateTimeRange(
                        monthRange[0], monthRange[1]
                );

                // 存储到Redis
                storeEventIds(eventIds, redisKey);

                // 跳转到下个月
                calendar.add(Calendar.MONTH, 1);
            }
        } catch (Exception e) {
            throw new RuntimeException("生成位图索引失败", e);
        }
    }

    /**
     * 解析年月字符串为日期（当月第一天）
     */
    private Date parseYearMonth(String yearMonth) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        return sdf.parse(yearMonth);
    }

    /**
     * 判断两个日期是否在同一个月
     */
    private boolean isSameMonth(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
    }

    /**
     * 获取指定日期所在月的日期范围
     *
     * @return [当月第一天, 当月最后一天]
     */
    private String[] getMonthDateRange(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        // 当月第一天
        cal.set(Calendar.DAY_OF_MONTH, 1);
        String start = formatDate(cal.getTime(), "yyyy-MM-dd");

        // 当月最后一天
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        String end = formatDate(cal.getTime(), "yyyy-MM-dd");

        return new String[]{start, end};
    }

    /**
     * 格式化日期
     */
    private String formatDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }


    /**
     * 使用双游标查找跳过id
     *
     * @param cursor1
     * @param cursor2
     * @return
     */
    public int getSecondCursorFromIndex(String cursor1, int cursor2) {

        // 从Redis中获取数据
        Map<Object, Object> metaHash = redisTemplate.opsForHash().entries(cursor1);
        String bitmapStr = (String) metaHash.get("bitmap");
        int baseId = (int) metaHash.get("baseId");

        // 如果需要将字符串转换为字节数组，可以使用以下代码：
        byte[] reversedBytes = Base64.getDecoder().decode(bitmapStr);// 默认使用平台默认字符集

        BitSet bitSet = BitSet.valueOf(reverseBitSetBytes(BitSet.valueOf(Optional.ofNullable(reversedBytes).orElse(new byte[0]))));
        int count = 0;
        int index = -1; // 初始化为-1，如果没有找到对应的1，则返回-1
        int fromIndex = 0; // 从0开始搜索

        while ((index = bitSet.nextSetBit(fromIndex)) != -1) {
            count++;
            if (count == cursor2) {
                break;
            }
            fromIndex = index + 1; // 更新搜索的起始位置
        }

        return index == -1 ? -1 : index + baseId;


    }


    public Page<Emergency> getPageMeta(int pageSize, int pageNum) {
        // 1. 获取所有分片键
        Set<String> shardKeys = redisTemplate.keys("event_bitmap:*");
        int totalCount = 0;
        HashMap<String, Integer> shardData = new HashMap<>();
        for (String shardKey : shardKeys) {
            Object countObj = redisTemplate.opsForHash().get(shardKey, "count");
            totalCount += countObj != null ? Integer.parseInt(countObj.toString()) : 0;
            shardData.put(shardKey, countObj != null ? Integer.parseInt(countObj.toString()) : 0);
        }

        // 3. 计算总页数（含边界处理）
        int totalPages = (int) Math.ceil((double) totalCount / pageSize);
        totalPages = Math.max(totalPages, 1); // 至少1页

        // 4. 校验页码有效性
        if (pageNum < 1 || pageNum > totalPages) {
            throw new IllegalArgumentException("无效页码: " + pageNum);
        }

        // 5. 计算分页起始位置（假设数据按时间倒序排列）
        int offset = (pageNum - 1) * pageSize;

        // 6. 获取分页起始ID（根据业务需求选择分片）
        Pair<String, Integer> targetShard = determineTargetShard(shardKeys, offset);
        int startId = getSecondCursorFromIndex(targetShard.getFirst(), targetShard.getSecond());

        // 7. 查询实际数据
        List<Emergency> data = emergencyMapper.selectListById(startId, pageSize);

        // 8. 构造分页对象
        return new Page<Emergency>(pageSize, pageNum, (int) totalCount, totalPages, data);
    }

    /**
     * 哈希表分片数据反序列化
     */
    private Map<String, Object> deserializeShard(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            return (Map<String, Object>) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException("分片数据反序列化失败", e);
        }
    }

    /**
     * 根据偏移量确定目标分片（示例逻辑）
     */
    private Pair<String, Integer> determineTargetShard(Set<String> shardKeys, int offset) {
        // 按时间倒序排列分片（假设分片键含时间）
        List<String> sortedKeys = shardKeys.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // 遍历分片累加计数直到超过偏移量
        int accumulated = 0;
        String resKey = "";
        for (String key : sortedKeys) {
            Object countObj = redisTemplate.opsForHash().get(key, "count");
            int count = countObj != null ? Integer.parseInt(countObj.toString()) : 0;
            accumulated += count;

            if (accumulated > offset) {
                resKey = key;
                accumulated = accumulated - count;
                break;
            }
        }
        int cursor2 = offset - accumulated;
        if (resKey.equals("")) {
            return new Pair<>(sortedKeys.get(sortedKeys.size() - 1), cursor2);
        }

        // 默认返回最后一个分片
        return new Pair<>(resKey, cursor2);
    }
}
