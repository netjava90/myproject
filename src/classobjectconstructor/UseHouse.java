package classobjectconstructor;

public class UseHouse {

	public static void main(String[] args) {
		
		//2 parameters 
		House myHouse = new House("white house", 1425);
		myHouse.room();
		
		//1 parameter
		House yourHouse = new House("the mellenuim");
		yourHouse.bathRoom();
		
		//no parameter
		House theHouse = new House();
		theHouse.bathRoom();

	}

}
