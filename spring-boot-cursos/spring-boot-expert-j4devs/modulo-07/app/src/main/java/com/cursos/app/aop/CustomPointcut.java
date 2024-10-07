package com.cursos.app.aop;

import org.aspectj.lang.annotation.Pointcut;

public class CustomPointcut {
    @Pointcut("@annotation(ActivityLogs)")
    public void activityLogsPointCut() {}
}
