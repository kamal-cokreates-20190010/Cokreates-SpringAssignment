package ckl.kamal.assignment;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	private FortuneService fortuneService;
			
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice everyday long shot for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}