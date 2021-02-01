 package com.mikecode.springcoach;


public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public TrackCoach() {};
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " +fortuneService.getFortune();
	}
	
	
	
	// add an init method
	public void writeMyCode() {
		System.out.println("TrackCoach: inside init method");
	}
	
	// destroy init method
	
	public void cleanMyCode() {
		System.out.println("TrackCoach now destroy your method");
		
		
	}
}
 