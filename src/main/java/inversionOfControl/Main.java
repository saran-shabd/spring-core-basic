package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)  {
		// create spring container
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve objects from spring container
		Coach coach = factory.getBean("coach", Coach.class);
		
		// use retrieved objects
		System.out.println(coach.getDailyWorkout());
		
		// close spring container
		factory.close();
	}
}
