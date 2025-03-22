package com.Crazylychee.demo03mysql;

import com.Crazylychee.demo03mysql.mock.emergency.CountTimer;
import com.Crazylychee.demo03mysql.mock.emergency.EmergencyDataGenerator;
import com.Crazylychee.demo03mysql.optimize.TestBitMapIndexInRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo03MysqlApplication implements CommandLineRunner {

    @Autowired
    private EmergencyDataGenerator emergencyDataGenerator;

    @Autowired
    private CountTimer countTimer;

    @Autowired
    private TestBitMapIndexInRedis testBitMapIndexInRedis;

    public static void main(String[] args) {
        SpringApplication.run(Demo03MysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 插入mock数据
//        System.out.println(ClassLayout.parseClass(Emergency.class).toPrintable());
//        countTimer.run(args);
//        emergencyDataGenerator.run(args);’
        // 运行分片位图索引测试
//
        //计算程序运行耗时
        long startTime = System.currentTimeMillis();


        //testBitMapIndexInRedis.generateMonthlyBitMapIndices("2021-01","2025-01");



        //遍历所有符合查询条件的位图，统计总数获取分页元数据
//        Page<Emergency> res = testBitMapIndexInRedis.getPageMeta(20, new Random().nextInt(100000)+500000);
//
//        Thread.sleep(100000);

    }
}
