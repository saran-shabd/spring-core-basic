package withAnnotationsDISetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("coach")
public class FootballCoach implements Coach {

	@Autowired  // Field Injection, no need for Constructor or Setter Injection
	private FortuneService fortuneService;

	public String getDailyWorkout() {
		return "One Hour of Passing Practice";
	}
	
	public String getFortune() {
		return fortuneService.getFortune();
	}
}
