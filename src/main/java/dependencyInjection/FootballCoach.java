package dependencyInjection;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "One Hour of Passing Practice";
	}
	
	public String getFortune() {
		return fortuneService.getFortune();
	}
}
