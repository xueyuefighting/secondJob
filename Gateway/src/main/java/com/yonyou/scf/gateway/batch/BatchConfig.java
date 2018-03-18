package com.yonyou.scf.gateway.batch;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 定时任务
 */

@Configuration
@EnableScheduling
public class BatchConfig {

    //@Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        System.out.println(">>>>>>>>> ** " + new Date().toString() + " ** <<<<<<<<<<<");
    }
}