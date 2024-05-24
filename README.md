# JPA
## 问题：
1. 在IdClass中不能使用继承

2. 加上@Trasactional后，query后会自动提交update

3. 在DB2中，某字段长度6char, 实际应用3char，findById后IdClass的数据发生变化，因此调用save时会报错：IdCLass不一致

# 一 多线程定时任务
## 1. ThreadPoolTaskScheduler
* 可以很方便的对重复执行的任务进行调度管理
* 支持根据cron表达式创建周期性任务
* 当然，底层也是java自带的线程池
### 常用api
* schedule(Runnable task, Trigger trigger) corn表达式，周期执行
* schedule(Runnable task, Date startTime) 定时执行
* scheduleAtFixedRate(Runnable task, Date startTime, long period)
  定时周期间隔时间执行。间隔时间单位 TimeUnit.MILLISECONDS
* scheduleAtFixedRate(Runnable task, long period) 间隔时间执行。单位毫秒
## 2. SchedulingConfigurer
#### 
* 必须加上@EnableScheduling：用于开启定时任务
* 实现SchedulingConfigurer接口，重写configureTasks方法
* 默认是单线程，也可以通过 `taskRegistrar.setScheduler(Executors.newScheduledThreadPool(5))`设置多线程
* 一些问题可以学习学习
    * [定时任务的发送时间修改后立即生效问题【集群问题】](https://blog.csdn.net/qq_37342720/article/details/108417179)
    * [源码分析](https://blog.csdn.net/Coder_Boy_/article/details/110676333)
    * https://dzone.com/articles/multiple-cron-task-with-spring-boot-scheduler
### 常用api
* addCronTask
* addFixedRateTask
* addTriggerTask
## 3. 其他
### 3.1 ScheduledExecutorService(JDK1.5 之后)
### 3.2 [ThreadPoolTaskScheduler & ThreadPoolTaskExecutor & ScheduledThreadPoolExecutor](https://blog.csdn.net/bigbearxyz/article/details/121158902)
* [ThreadPoolTaskExecutor](https://zhuanlan.zhihu.com/p/346086161)
  Spring封装的，本质是对java.util.concurrent.ThreadPoolExecutor的包装，可以异步执行任务
* ScheduledThreadPoolExecutor 继承自 ThreadPoolExecutor(JDK), 主要用来在给定的延迟之后运行任务，也可以设置周期定时执行，也可以直接设置触发时间。缺点是不支持cron这种灵活配置。
  代码实现不是很灵活，修改需要重启项目。
  功能单一。可视化、监控等都不支持，也不支持分布式等等功能。
* ThreadPoolTaskScheduler Spring
  常用于项目中的带有定时计划的异步任务处理, PoolSize为1的情况下，容易出现阻塞问题。【通常我们会选择ThreadPoolTaskScheduler】
### 3.3 Quartz