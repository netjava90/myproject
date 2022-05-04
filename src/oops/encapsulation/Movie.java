package oops.encapsulation;

public class Movie {
	
	//encapsulation is data hiding
	private String name;
	int duration; 
	String popCorn;
	
	//setter is a method that isn't returning anything, that has a parameter name
	//string name is used as a parameter to change its value 
	public void setName(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	
}
