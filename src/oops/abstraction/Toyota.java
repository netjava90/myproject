package oops.abstraction;

public class Toyota implements Car, Motor{
	
	//abstraction is an implementation hiding
	//a class can implement multiple interfaces(car/motor)
	//implement is when a class implementing an interface
	
	
	public void start() {
		System.out.println("turn the kye to start");
			
	}

	
	public void stop() {
		System.out.println("brake to stop");
	
		
	}

	public void engine() {
		System.out.println("v6");
		
	}


	
	public void fuel() {
		System.out.println("diesel");
		
	}

}
