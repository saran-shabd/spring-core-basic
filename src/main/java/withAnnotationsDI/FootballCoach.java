package withAnnotationsDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("coach")
public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "One Hour of Passing Practice";
	}
	
	public String getFortune() {
		return fortuneService.getFortune();
	}
}
