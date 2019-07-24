package withAnnotations;

import org.springframework.stereotype.Component;

@Component("coach")  // this will automatically register the bean
public class FootballCoach implements Coach {

	public String getDailyWorkout() {
		return "One Hour of passing practice";
	}
}
