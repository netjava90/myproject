package singleton;

public class Singleton {
	//singleton object protection by making the constructor hiding
	//create an object inside the class itself and make it private.
	//to access it we create the getter.
	
	private static Singleton singleton = new Singleton();
	
	private Singleton(){
		
		//getter
	}
	//public Singleton getinstance
	
   public static Singleton getInstance() {
	   return  singleton;
   }
   
   public void doWork() {
	   System.out.println("do any work");
   }
}
