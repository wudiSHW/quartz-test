package com.example.quartztest.until;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoTest1 extends QuartzJobBean {

    private final AtomicInteger num = new AtomicInteger();
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())+" 执行第"+num.incrementAndGet()+"次");
    }
}
