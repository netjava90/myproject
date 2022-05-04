package oops.polymorphism;

public class ModernCalculator extends Calculator{
	
	//same method name, same parameters, different body (implementation). (subclass, run time)
	
   @Override
	public int sub(int x, int y ) {
		int total = x + y + 10;
		return total;
	}
	
}
