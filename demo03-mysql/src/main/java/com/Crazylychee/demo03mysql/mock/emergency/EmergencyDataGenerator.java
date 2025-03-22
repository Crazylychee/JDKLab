package com.Crazylychee.demo03mysql.mock.emergency;


import com.Crazylychee.demo03mysql.mock.Emergency;
import com.Crazylychee.demo03mysql.mock.mapper.EmergencyMapper;
import lombok.extern.slf4j.Slf4j;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
@Slf4j
@Component
public class EmergencyDataGenerator {

    @Autowired
    private EmergencyMapper emergencyMapper;


    // 事件类型对应的描述模板（动态填充）
    private static final Map<String, String> EVENT_DESCRIPTION_TEMPLATES =  Collections.unmodifiableMap(new HashMap<String, String>() {{
                put("消防安全", "%s的%s发生火灾，%s");
                put("气象安全", "%s遭遇%s，%s");
                put("地质安全", "%s发生%s，%s");
                put("生产安全", "%s的%s发生生产事故，%s");
            }});
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    // 模板填充词库
    private static final String[] LOCATIONS = {"仓库", "居民楼", "商场", "工厂", "山林"};
    private static final String[] DISASTER_TYPES = {
            "火灾", "爆炸",
            "暴雨", "台风", "冰雹",
            "山体滑坡", "轻微地震",
            "设备故障", "化学品泄漏"
    };
    private static final String[] DETAILS = {
            "暂无人员伤亡", "已疏散周边群众",
            "救援正在进行中", "原因正在调查",
            "预计3小时内控制"
    };

    // 定义中国行政区划代码（示例，实际需覆盖全国）
    private static final String[] REGION_CODES = {
            "110101", // 北京市东城区
            "310115", // 上海市浦东新区
            "440305", // 深圳市南山区
            "330102", // 杭州市上城区
            "420106", // 武汉市武昌区
            // 添加更多区划代码...
    };

    // 街道词库
    private static List<String> streetPool = new ArrayList<>();

    // 生成递增的 event_id（线程安全）
    private static final AtomicLong EVENT_ID_COUNTER = new AtomicLong(1L);

    public void run(String[] args) {
        // 生成街道词库

        Faker tempFaker = new Faker(Locale.CHINA);
        for (int i=0; i<1000; i++) {
            streetPool.add(tempFaker.address().streetName());
        }


        final int totalIds = 60_000_000;
        final int batchSize = 100_000;
        final int totalBatches = totalIds / batchSize;
//        ExecutorService executor = Executors.newWorkStealingPool();
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(600);
        ExecutorService executor = new ThreadPoolExecutor(
                12+1, // 核心线程数
                12+1, // 最大线程数
                1000, // 线程空闲时间
                TimeUnit.MILLISECONDS, // 时间单位
                workQueue // 任务队列
        );
        List<CompletableFuture<Void>> futures = new ArrayList<>();

        for (int i = 0; i < totalBatches; i++) {
            final int start = i * batchSize +1;
            final int end = (i + 1) * batchSize;
            futures.add(CompletableFuture.runAsync(() -> {
                Faker faker = new Faker(Locale.CHINA);
                for (int j = start; j <= end; j++) {

                    Emergency emergency =  EmergencyMock(faker,j);
                    log.info("Emergency: {}", emergency);
                }
            }, executor));
        }

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() ->{
                    System.out.println("All data generated successfully!");
                    executor.shutdown();
                })
                .join();

    }

    private static Emergency EmergencyMock(Faker faker,int index) {
        Emergency emergency = new Emergency();
        // 生成 event_id（1-5000万）
        emergency.setEventId(String.valueOf(index));

        // 生成 regionId：6位行政区划代码 + 4位随机数字
        String baseRegion = faker.options().nextElement(REGION_CODES);
        int randomSuffix = faker.number().numberBetween(0, 10000); // 生成0-9999的随机数
        String fullRegionId = baseRegion + String.format("%04d", randomSuffix); // 补零至4位
        emergency.setRegionId(fullRegionId);
        emergency.setEmergencyLevel(faker.options().option("0", "1", "2"));
        // 生成事件类型
        String eventType = faker.options().option("消防安全", "气象安全", "地质安全", "生产安全");
        emergency.setEventType(eventType);
        // 根据事件类型生成动态描述（50字以内）
        String description = generateEventDescription(faker, eventType);
        emergency.setEventDescription(description);
        emergency.setCreateTime(generateCreateTime(index));
        return emergency;
    }


    private static String generateEventDescription(Faker faker, String eventType) {
        // 获取模板
        String template = EVENT_DESCRIPTION_TEMPLATES.get(eventType);

        // 填充模板参数
        String region = streetPool.get(new Random().nextInt(1000));// 如 "北京市朝阳区建国路"
        String locationOrDisaster = faker.options().nextElement(
                eventType.equals("消防安全") ? LOCATIONS :
                        DISASTER_TYPES
        );
        String detail = faker.options().nextElement(DETAILS);

        // 生成完整描述
        String fullDescription = String.format(template, region, locationOrDisaster, detail);

        // 截断至50字（保证句子完整性）
        return truncateTo50Chars(fullDescription);
    }

    private static String truncateTo50Chars(String text) {
        if (text.length() <= 50) return text;
        // 找到50字内最后一个句号或逗号，避免截断句子中间
        int lastValidIndex = text.lastIndexOf('。', 49);
        if (lastValidIndex == -1) lastValidIndex = text.lastIndexOf('，', 49);
        if (lastValidIndex == -1) lastValidIndex = 50;
        return text.substring(0, lastValidIndex + 1);
    }
    private static String generateCreateTime(long recordIndex) {
        // 计算当前记录所属的月份偏移量（每100万条切换一个月）
        long monthOffset = recordIndex / 1_000_000L;

        // 计算目标年份和月份
        int year = 2021 + (int) (monthOffset / 12);
        int month = 1 + (int) (monthOffset % 12);

        // 生成该月内的随机日期
        YearMonth yearMonth = YearMonth.of(year, month);
        int day = ThreadLocalRandom.current().nextInt(1, yearMonth.lengthOfMonth() + 1);
        LocalDate date = LocalDate.of(year, month, day);

        return date.format(DATE_FORMATTER);
    }
}
