package com.mikecode.springcoach;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for email adn team;
	
	private String emailAdd;
	private String team;
	
	
	
	
	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		System.out.println("Cricket Coach inside setter method Email");
		this.emailAdd = emailAdd;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach finside setter method Team");
		this.team = team;
	}

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
