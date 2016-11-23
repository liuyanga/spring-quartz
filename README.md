#Spring+Quartz实现定时任务Demo
##Spring+Quartz实现Job有两种方式(第一种)
###继承org.springframework.scheduling.quartz.QuartzJobBean类来实现Job任务，并实现里面的抽象方法executeInternal

####Spring整合Quartz实现定时任务步骤很简单，大致需要经过如下几步
*1 创建任务（Job）
*2 配置JobDetail
*3 配置触发器（Trigger）
*4 配置SchedulerFactoryBean