package com.example.springdemo.scheduled;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

public class AdhocScheduleImpl extends ThreadPoolTaskScheduler implements AdhocSchedule {
    private Map<String, ScheduledFuture<?>> taskPool = new HashMap<>();

    @Override
    public ScheduledFuture<?> schedule(String taskId, Runnable task, Trigger trigger) {
        return taskPool.computeIfAbsent(taskId, key ->super.schedule(task, trigger));
    }

    @Override
    public ScheduledFuture<?> getTask(String taskId) {
        return taskPool.get(taskId);
    }

    @Override
    public void deleteTask(String taskId) {
        taskPool.remove(taskId);
    }
}
