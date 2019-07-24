package withAnnotationsDIQualifiers;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// create spring container
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("withAnnotationsDIQualifiers-applicationContext.xml");
		
		// retrieve object from spring container
		Coach coach = factory.getBean("coach", Coach.class);
		
		// use retrieved object
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		// close spring container
		factory.close();
	}
}
