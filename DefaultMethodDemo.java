interface TestInterface {

	// abstract method	
	public void square(int a);
	
	// default method
	default void show()
	{
		System.out.println("default method executed");
	}
	
	//static method
	static void show1()
	{
		System.out.println("static method executed");
	}
}

public class DefaultMethodDemo implements TestInterface{
	
	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a*a);
	}
	
	public static void main(String[] args) {
		
		DefaultMethodDemo d = new DefaultMethodDemo();
		d.square(4);
		
		// default method executed
		d.show();
		
		// static method executed
		TestInterface.show1();
	}
}
