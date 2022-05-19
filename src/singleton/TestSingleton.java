package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		//Singleton singleton = new Singleton (has private access)
		
		Singleton singleton = Singleton.getInstance();
		
        singleton.doWork();
	}

}
