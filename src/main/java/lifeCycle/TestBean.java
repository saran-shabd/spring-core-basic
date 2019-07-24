package lifeCycle;

public class TestBean {

	public void initMethod() {  // this can be named whatever you want
		System.out.println("this is before time");
	}
	
	public void destroyMethod() {  // this can also be named whatever you want
		System.out.println("this is after time");
	}
	
	public String sayHello() {
		return "Hello";
	}
}
