// block lambda expressions
public class LambdaDemo2 {


	public static void main(String[] args) {
		
		MyString reverseStr = (str) -> {   // here it's a block lambda expression
			
				String result = "";
				for(int i=str.length()-1;i>=0;i--)
				{
					result += str.charAt(i);
				}   
				return result;                   
		};
		
		System.out.println(reverseStr.myStringFunction("Lambda Demo"));
	}
}
