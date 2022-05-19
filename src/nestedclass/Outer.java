package nestedclass;

public class Outer {
	
	//class attributes (properties that belong to the class) variables, constructors, methods, class
	//we can have constructor attributes and method attributes.
	int outerNum = 52;
	
	Outer() {
		
	}
	
 public void outerMetod() {
	 System.out.println("this is outer method");
	 
 }
 
 Inner inner = new Inner();
		 
 
 class Inner {
	 
	 int innerNum = 85;
	 
	 Inner(){
		 
	 }
	 
	 public void innerMethod() {
		 System.out.println("this is an inner method");
		 
	 }
	 
	 
 }

}

