import java.util.HashMap;
import java.util.Map;

public class LambdaDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> books = new HashMap<>();
		books.put("Let US C", "Yashwant Kanetkar"); 
		/* books.put("Let US C", "Yashwant Kanetkar"); when we again define
				same key value it'll only take it once not to be repeated */
		books.put("Object Oriented Programming Using JAVA", "Simon Kendal");
		books.put("JAVA: Graphical User Interfaces", "David Etheridge");
		
		books.forEach((key,value) -> System.out.println("Book Name :- " + key + ", Author :- " +value));
		
		System.out.println();
		
		books.forEach((key,value) -> {
			System.out.println("Book Name :- " + key + "Author :- " + value);
			
		});

		System.out.println();
	}

}
