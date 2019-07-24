package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("di-applicationContext.xml");
		
		// retrieve bean class
		Coach coach = factory.getBean("coach", Coach.class);
		
		// use retrieved class
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		// close spring container
		factory.close();
	}
}
