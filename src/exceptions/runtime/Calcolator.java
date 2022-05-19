package exceptions.runtime;

public class Calcolator {

	public static void main(String[] args) {
 
		int a = 10;
		int b = 0;
		
		System.out.println("Line1");
		System.out.println("Line2");
		System.out.println("Line3");
		
		try {
			System.out.println("Line4"+a/b);
		}catch (ArithmeticException e) {
			System.out.println("Line 4 error");
			e.printStackTrace();
			}
		
		System.out.println("Line5");
		System.out.println("line6");
		

	}

}
