package oops.abstraction;

public class TestCar {
	//from interface to another we use extend (not implement)
	
	public static void main(String[] args) {
		
		//Toyota is a class we have access to everything on it.
		Toyota corolla = new Toyota();
		corolla.start();
		corolla.stop();
		corolla.engine();
		corolla.fuel();
		
		//Honda is a class we have access to everything on it.
		Honda civic = new Honda();
		civic.start();
		civic.stop();
		civic.engine();
		civic.fuel();
			
		//car is interface (access to interface only)
        Car accord = new Honda();
        accord.start();
        accord.stop();
        
        //Motor is interface (access to interface only)
        //you can not create in interface
        Motor mt = new Honda();
        mt.fuel();
        mt.engine();
	}
	
}
