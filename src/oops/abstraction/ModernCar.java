package oops.abstraction;

//abstract class is a hybrid class interface
//it can have both abstract and normal methods

public abstract class ModernCar {
	
	
  //abstract method
	public abstract void hydraulicBreak ();
	
  //non abstract method
	public void autoLock() {
		System.out.println("auto lock after 10 secs");
	}

}