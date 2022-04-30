package statickyeword;

public class Human {

	int height;
	static int weight;
	
	//non static method can use both static and non static variables
	public void person1() {
		 height = 9;
		 weight = 180;
	}
	//static method can use only static variables 
	public static void person2() {
		height = 9;
		weight = 180;
		
	}
}
