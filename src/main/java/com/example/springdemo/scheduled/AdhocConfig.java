package com.example.springdemo.scheduled;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdhocConfig {

    @Bean
    public AdhocSchedule adhocSchedule(){
        AdhocScheduleImpl adhocSchedule = new AdhocScheduleImpl();
        adhocSchedule.setPoolSize(10); // 设置线程池大小
        adhocSchedule.setThreadNamePrefix("adhocSchedule-"); // 设置线程名称前缀
        return adhocSchedule;
    }
}
