package lifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("lifeCycle-applicationContext.xml");
		
		// retrieve object from spring container
		TestBean bean = factory.getBean("test", TestBean.class);  // init-method will be called
		
		// use retrieved object
		System.out.println(bean.sayHello());
		
		// close spring container
		factory.close();  // destroy-method will be called
	}
}
