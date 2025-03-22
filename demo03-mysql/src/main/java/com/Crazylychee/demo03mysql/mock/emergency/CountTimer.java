package com.Crazylychee.demo03mysql.mock.emergency;

import com.Crazylychee.demo03mysql.mock.mapper.EmergencyMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CountTimer {
    @Autowired
    private EmergencyMapper emergencyMapper;

    public void run(String[] args) {
        new Thread(() -> {
            while (true) {
                //before统计10s前的数据量
                log.info("Thread is about to execute selectCounts() before sleep");
                int before = emergencyMapper.selectCounts();
                log.info("Thread has executed selectCounts() before sleep");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //after统计10s后的数据量
                log.info("Thread is about to execute selectCounts() after sleep");
                int after = emergencyMapper.selectCounts();
                log.info("Thread has executed selectCounts() after sleep");
                log.info("after: " + after + ", before: " + before + ", count: " + (after - before));
            }
        }).start();
    }
}
