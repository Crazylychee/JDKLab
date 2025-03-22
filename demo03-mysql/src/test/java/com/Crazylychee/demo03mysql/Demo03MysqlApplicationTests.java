package com.Crazylychee.demo03mysql;

import com.Crazylychee.demo03mysql.mock.Emergency;
import com.Crazylychee.demo03mysql.mock.mapper.EmergencyMapper;
import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Demo03MysqlApplicationTests {

    @Autowired
    private EmergencyMapper emergencyMapper;

    @Test
    void contextLoads() {
        Emergency emergency = new Emergency();
        emergency.setEventId("1");
        emergency.setRegionId("1");
        emergency.setEmergencyLevel("1");
        emergency.setEventType("1");
        emergency.setEventDescription("1");
        emergency.setCreateTime("2021-01-06");
        System.out.println(ClassLayout.parseInstance(emergency).toPrintable());
//        emergencyMapper.insert(emergency);

    }

    @Test
    void testSelectCounts() throws InterruptedException {
        // 正确创建日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM");
        Date date;
        try {
            date = sdf.parse("2021 01");
        } catch (ParseException e) {
            throw new RuntimeException("Error parsing date", e);
        }

        // 调用方法并获取结果
        List<Integer> eventIds = emergencyMapper.selectEventsByCreateTimeRange("2021-01-01", "2021-01-31");

        Thread.sleep(100000);

        // 打印结果
        for (Integer eventId : eventIds) {
            System.out.println(eventId);
        }
    }

    @Test
    void testSelectListById() {
        List<Emergency> emergencies = emergencyMapper.selectListById(7000, 10);
        for (Emergency emergency : emergencies) {
            System.out.println(emergency);
        }
    }

}
