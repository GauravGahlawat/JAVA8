import java.util.Arrays;
import java.util.List;

public class LambdaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Before JAVA 8, too much code for too little to do");
			}
		}).start();
		
		// Java 8 way:
		
		new Thread( () -> System.out.println("In Java 8, Lambda Expression rocks !!") ).start();
		
		System.out.println("-----------*************************-------------");
		
		// Iterating Over List Using Lambda Expressions
		
		List features = Arrays.asList("Lambdas","Default Method","Stream API","DAte and Time API");
		
		features.forEach(n -> System.out.println(n));

		System.out.println("-----------*************************-------------");
				
		// Even better use method reference feature of Java 8
		// method reference is denoted by ::  ****double colon*****   operator
		// looks similar to scope resolution operator of C++
		
		features.forEach(System.out::println);

	}

}
