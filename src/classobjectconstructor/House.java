package classobjectconstructor;

public class House {

	//variables
	int address;
	String houseName;
	private char unit;
	
	//constructor
	//built constructors
	
	House(String myHouseName){
		houseName = myHouseName;
	}
	
	House(String myHouseName, int myAddress){
		houseName = myHouseName;
		address = myAddress;
	}
	
	// default constructor provided by java
	
	 House(){
		 
	 }
	
	//methods
	void kitchen() {
		System.out.println("miam miam eat the whole thing");
	}
	
	 void room() {
		System.out.println("sleep zzzzzzzzzzzzzzzzzzzzzzzz");
		
	}
	
	void bathRoom() {
		System.out.println("shower shower lalallalalalal");
	}
}
