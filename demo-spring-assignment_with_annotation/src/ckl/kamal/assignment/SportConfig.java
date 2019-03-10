package ckl.kamal.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
		
	// define bean for our happy fortune service
	@Bean
	public FortuneService WishFortuneService() {
		return new WishFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach FootballCoach() {
		FootballCoach myFootballCoach = new FootballCoach(WishFortuneService());
		
		return myFootballCoach;
	}
	
}








