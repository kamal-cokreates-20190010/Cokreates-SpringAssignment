package ckl.kamal.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	// define a default constructor
	public FootballCoach() {
		System.out.println("FootballCoach: inside default constructor");
	}
		
	@Override
	public String getDailyWorkout() {
		return "Practice your football long shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}