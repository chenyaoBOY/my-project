package org.spring.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * AOP配置类
 */
@Component
//声明该类是一个切面
@Aspect
public class AopSet {
    /**
     * 声明切点
     */
    @Pointcut("@annotation(org.spring.study.aop.Action)")
    public void pointCut(){

    }

    /**
     * 注解式拦截
     *      优点：精确定位
     *      缺点：维护麻烦
     * @param point
     */
    @Before("pointCut()")
    public void before(JoinPoint point){
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("注解式拦截");
        System.out.println("开始执行方法 name = "+method.getName());
    }

    /**
     * 表达式规则拦截
     *      优点：维护方便
     *      缺点：表达式复杂 ，大量方法被AOP
     * @param point
     */
    @After("execution(* org.spring.study.aop.DemoService.*(..))")
    public void after(JoinPoint point){
       MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        String value = action.value();
        System.out.println("业务名称 name = "+value);
        System.out.println("表达式规则拦截");

    }

}
