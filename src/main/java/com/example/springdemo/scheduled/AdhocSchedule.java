package com.example.springdemo.scheduled;

import org.springframework.scheduling.Trigger;

import java.util.concurrent.ScheduledFuture;

public interface AdhocSchedule {

    ScheduledFuture<?> schedule(String taskId, Runnable task, Trigger trigger);

    ScheduledFuture<?> getTask(String taskId);

    void deleteTask(String taskId);
}
