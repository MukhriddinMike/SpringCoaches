package com.mikecode.springcoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDapp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
	
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//finished lesson 34 
		/** 
		 * Done So far is
		 * Creating BeanScope
		 * and retrieve two coaches from spring container;
		 * **/
	
	}

}
