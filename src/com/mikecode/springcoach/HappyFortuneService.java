package com.mikecode.springcoach;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your Luck day";
	}

}
