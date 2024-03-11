package iegcode.spring.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("target(iegcode.spring.aop.service.HelloService)")
    public void helloServiceMethod(){

    }

    @Before("helloServiceMethod()")
    public void beforeHelloServiceMethod(){
      log.info("Before HelloService Method");
    }

}
