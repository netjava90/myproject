package oops.polymorphism;

public class Calculator {

	public int add(int x, int y) {
		int total = x + y;
		return total;
	}
	
	//method overloading: same method name with # parameters (same class, compiler time)
	
	public int add(int x, int y, int z) {
		int total = x + y;
		return total;
	}
	
	
	public int sub(int x, int y) {
		int total = x - y;
		return total;
		
	}
}
