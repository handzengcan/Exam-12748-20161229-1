package com.test.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AppContextListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof ContextStartedEvent){
            System.out.println("Context Start");
        }
        else if(event instanceof ContextStoppedEvent){
        	System.out.println("Context Stop");
        }else if(event instanceof BeforeInsertFilmEvent){
			System.out.println("Before Insert Film Data");	
		}else if(event instanceof  AfterInsertFilmEvent){
			System.out.println("After Insert Film Data");
		}
	}

}
