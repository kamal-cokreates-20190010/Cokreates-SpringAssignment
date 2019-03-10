package ckl.kamal.assignment;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	// define a default constructor
	public FootballCoach() {
		System.out.println("FootballCoach: inside default constructor");
	}
		
	@Override
	public String getDailyWorkout() {
		return "Practice your football long shot";
	}

}
