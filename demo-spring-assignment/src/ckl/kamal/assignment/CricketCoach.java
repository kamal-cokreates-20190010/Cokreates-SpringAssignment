package ckl.kamal.assignment;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice everyday for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}


