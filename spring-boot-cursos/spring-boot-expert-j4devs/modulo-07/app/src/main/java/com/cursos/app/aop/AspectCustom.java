package com.cursos.app.aop;

import com.cursos.app.customexeptions.MessageException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Aspect
@Component
public class AspectCustom {

    private static final Logger LOG = LoggerFactory.getLogger(AspectCustom.class);

    @AfterReturning(pointcut = "CustomPointcut.activityLogsPointCut()", returning = "result")
    public void pintarLogCustom(JoinPoint joinPoint, Object result) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method classNameMethod = signature.getMethod();
        ActivityLogs activityLogsAnnotation = classNameMethod.getAnnotation(ActivityLogs.class);
        String path = activityLogsAnnotation.path();

        if (result instanceof ResponseEntity) {
            int statusCode = ((ResponseEntity<?>) result).getStatusCode().value();
            LOG.info("Servicio: {}, Codigo: {}, Sistema: {}, Detalle: {}", path, statusCode, "CREDITO", "Informacion obtenida");
        }
    }

    @AfterThrowing(pointcut = "CustomPointcut.activityLogsPointCut()", throwing = "ex")
    public void pintarLogCustomException(JoinPoint joinPoint, Exception ex) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method classNameMethod = signature.getMethod();
        ActivityLogs activityLogsAnnotation = classNameMethod.getAnnotation(ActivityLogs.class);
        String path = activityLogsAnnotation.path();

        if(ex instanceof MessageException){
            Integer codigoError = ((MessageException) ex).getCodeError();
            LOG.info("Servicio: {}, Codigo: {}, Sistema: {}, Detalle: {}", path, codigoError, "CREDITO", ex.getCause());
        }
        else{
            LOG.info("Servicio: {}, Codigo: {}: Sistema: {}, Detalle {}", path, 404, "CREDITO", ex.getCause());
        }
    }

}
