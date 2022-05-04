package statickyeword;

import oops.inheretance.Father;

public class TestHuman {

	public static void main(String[] args) {
		
		//we can only access non static attributes through the object
		//non static belong to the object
		
		Human human = new Human();
	    human.person1();
		//human.person(2);
		
		//we can access the static using the class name
		//static attributes belong to the the class name only
		
		Human.person2();
		//Human.person1();
		
		

	}

}
