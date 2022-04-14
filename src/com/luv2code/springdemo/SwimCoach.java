package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService; //Defining private field fortuneService
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;  //Constructor is defined only not executed here	
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}