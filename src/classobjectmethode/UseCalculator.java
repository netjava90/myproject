package classobjectmethode;

public class UseCalculator {

	public static void main(String[] args) {
		
		// object: is and instance of a class 
		// syntax: ClassName objectiveName = new ClassName();
		
		Calculator ahmed = new Calculator();
		
		int mytotal = ahmed.sub();
		System.out.println(mytotal);
		
		int mySurface = ahmed.surface(10,34);
		System.out.println(mySurface);
		
		int myTemp = ahmed.cToF(0);
		System.out.println(myTemp);
		
	   String myName =ahmed.myName();
	   System.out.println("Hi "+myName+" welcome to java class");
	   
	   String myName1 =ahmed.myName();
	   System.out.println("Hi "+myName1+" welcome to java class");
	   
	   String myName2 =ahmed.myName();
	   System.out.println("Hi "+myName2+" welcome to java class");
	   
	   ahmed.substration();
	   
	   ahmed.addition(25, 25);
	   ahmed.addition(50, 134);
	   
	}

}
