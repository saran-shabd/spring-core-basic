package withAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("withAnnotations-applicationContext.xml");
		
		// retrieve object from spring container
		Coach coach = factory.getBean("coach", Coach.class);
		
		// use retrieved object
		System.out.println(coach.getDailyWorkout());
		
		// close spring container
		factory.close();
	}
}
