package com.test.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.test.listener.AfterInsertFilmEvent;
import com.test.listener.BeforeInsertFilmEvent;


@Aspect
@Component
public class AopFilm implements ApplicationContextAware{
	private ApplicationContext aContext;
	
	
	@Before("execution(* com.test.service.impl.FilmServiceImpl.*(..))")
	public void beforeInsert(){
		aContext.publishEvent(new BeforeInsertFilmEvent(aContext));
	}
	@After("execution(* com.test.service.impl.FilmServiceImpl.*(..))")
	public void afterInsert(){
		aContext.publishEvent(new AfterInsertFilmEvent(aContext));
	}


	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.aContext = applicationContext;
	}

}
