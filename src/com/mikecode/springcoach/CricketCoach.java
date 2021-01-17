package com.mikecode.springcoach;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	// no-arg contructor
	public  CricketCoach() {
		System.out.println("Cricket Coach file with inside no arguments");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() { 
		
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach file with inside no setter Cricket");
		this.fortuneService = fortuneService;
	}

}
