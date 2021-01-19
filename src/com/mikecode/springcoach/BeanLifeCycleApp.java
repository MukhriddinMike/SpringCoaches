package com.mikecode.springcoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

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
		
		
		
		boolean result = (theCoach == alphaCoach);
		
		//print results
		
		System.out.println("\nPointing to the same object " + result);
		
		System.out.println("\n Memory Location for the Coach " + theCoach);
		
		System.out.println("\n Memory Location for the Alpha Coach " + alphaCoach);
		// close the context
		
		context.close();
	} 

}
