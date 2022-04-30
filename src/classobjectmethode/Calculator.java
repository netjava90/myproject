package classobjectmethode;

public class Calculator {

	//public static void main(String[] args) {
		//java class is blue print (about class and objects)
		//main method is a starting point
		
		//class attributes 
		//1- variables
		int number1 = 10;
		int number2 = 23;
		
		int length = 65414;
		int width = 69554;
		
		//2 method is reusable block of code that runs when called
		//methodType methodName () {code to execute}
		
		int addition () {
			int total = number1 + number2;
			return total; 
		}
		int surface() {
			int total = length * width;
			return total;
			
		}
	

}
