package com.naveen.aspects;

import java.util.Arrays;
import java.util.Collection;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

// logs are captured here 
@Component
@Aspect
@Slf4j
public class LoggingAspect {

//	@Pointcut("execution(* com.naveen.services.GreetService.*(..))")
//	public void executionPoint() {}

	@Pointcut("@annotation(Loggable)")
	public void executionPoint() {
	}

	@Before(value = "executionPoint()")
	public void logMeBefore() {
		log.info("for Greeting Class - i'm in before>>>>>>>>>");
	}

	@Before(value = "executionPoint()")
	public void logMeBeforeSayGreet() {
		log.info("i'm in before(sayGreeting) - >>>>>>>>>");
	}

	@AfterReturning(value = "executionPoint()")
	public void logMeAfter() {
		log.info("after logging here <<<<<<<<<<");
	}

	@Around(value = "executionPoint()")
	public void logAround(ProceedingJoinPoint proceedJoinPoint) throws Throwable {
		// before
		log.info(" in around before ******** ");
		
		proceedJoinPoint.proceed();
		// after
		log.info(" in around after ******** ");
	}
	
	
	
	

    @Around(value = "executionPoint()")
    public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object returnValue = joinPoint.proceed();
        long totalTime = System.currentTimeMillis()-startTime;
        
        StringBuilder message = new StringBuilder("Method: ");
        message.append(joinPoint.getSignature().getName());
        message.append(" totalTime: ").append(totalTime).append("ms");
        Object[] args = joinPoint.getArgs();
        
        if (null!=args && args.length>0){
            message.append(" args=[ | ");
            Arrays.asList(args).forEach(arg->{
                message.append(arg).append(" | ");
            });
            message.append("]");
        }
        
        if(returnValue instanceof Collection){
            message.append(", returning: ").append(((Collection)returnValue).size()).append(" instance(s)");
        }else{
            message.append(", returning: ").append(returnValue.toString());
        }

        log.info(message.toString());
        return returnValue;
    }
	
	
	
	
	
	
	
	
	
	
	

}
