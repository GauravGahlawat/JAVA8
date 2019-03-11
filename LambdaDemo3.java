import java.util.ArrayList;

public class LambdaDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		
		// Using Lambda Expression To print all elements Of "arrL"
		
		System.out.println("ARRAY ELEMENTS BE:");
		arrL.forEach(n -> System.out.println(n));
		
		// Uisng Lambda Expression To print even elements of "arrL"

		System.out.println("EVEN ARRAY ELEMENTS BE:");
		arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });

		// Uisng Lambda Expression To print odd elements of "arrL"

		System.out.println("ODD ARRAY ELEMENTS BE:");
		arrL.forEach(n -> { if (n%2 != 0) System.out.println(n); });
		
	}

}
