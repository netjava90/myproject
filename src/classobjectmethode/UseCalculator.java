package classobjectmethode;

public class UseCalculator {

	public static void main(String[] args) {
		// object: is and instance of a class 
		// syntax: ClassName objectiveName = new ClassName();
		Calculator ahmed = new Calculator();
		
		int mytotal = ahmed.addition();
		System.out.println(mytotal);
		
		int mySurface = ahmed.surface();
		System.out.println(mySurface);
	}

}
