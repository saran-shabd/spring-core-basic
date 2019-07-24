package withAnnotationsDIQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("coach")
public class FootballCoach implements Coach {

	@Autowired
	@Qualifier("realFortuneService")
	private FortuneService fortuneService;
	
	/*
	 * since, there are two Beans implementing FortuneService,
	 * Bean to be auto-wired must be specified
	 * */
	
	public String getDailyWorkout() {
		return "One Hour Passing Practice";
	}
	
	public String getFortune() {
		return fortuneService.getFortune();
	}
}
