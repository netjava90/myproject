package superkeyword;

public class Child extends Father {

	Child(){
		super(10);
		
	}
	//super refers to the superclass
	//this refers to the global variable
	
	public void school () {
		super.education();
		super.weight = 190;
	}
}
