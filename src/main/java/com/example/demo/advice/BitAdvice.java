package com.example.demo.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
// Componet 어노테이션 자동으로 스캔된다.
public class BitAdvice {
	
	//pointcut 생성
	@Pointcut("execution(public * com.example.demo.controller..*(..))")
	public void cmethod() {}
	
	@Before("cmethod()")
	public void before() {
		System.out.println("컨트롤러 동작하기전");
	}
	
	
}
