package variables;

public class Variables {
	public static void main(String[] args) {
		
		//syntax: variable Type variable Name = variable Value
		      //variable declaration 
		        int n;
		      //variable assignment 
		        n = 52;
		      //in line declaration and assignment 
		        int w = 10;
		
		//poor naming using x,y,i etc
		//strong naming is using age, length, ...
	    // camel case
		int ageOfTheDog = 25;
		        
		//using variable.
		        int total = n + w;
		//numbers
		    //wholes numbers 
		byte b = 123; //1 byte //takes up to 127
		short s = 2542; //2 bytes
		int x = 1; //4 bytes
		long l = 65425l; //8 bytes
		
		//variable declaration
		int i;
		i = 52;
		
		     //fractions 
		float f = 1.255454F; //4 bytes
		double d = 1.12445; //8 bytes
		
		//character 
		char a = '$'; // 2 bytes
		char c = '+';
		//boolean
		boolean boo = true; //1 bit (1/8) byte
		
		//chain of characters
		String str = "hdvfvjdfkvjfvhwefoievj";
		String str1 = "Hello";
	    String str2 = "world";
		
	    System.out.println(a);
		System.out.println(boo);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(str);
	    System.out.println(ageOfTheDog);
		
		
		//string concatenation whenever you print a string plus another one
		
		System.out.println(str1+" "+str2);
		
		System.out.println(str1+str2);
		
		String name = "dave";
		
		name = "dida";
		
		System.out.println(name);
		
		String number = "1";
		
		System.out.println(number);
		
		number = "2";
		
		System.out.println(number);
		
		int adress = 43;
		
		adress = 575;
		ageOfTheDog--;
		
		System.out.println(adress);
		System.out.println(ageOfTheDog);
		
		
		//arithmetic operators: +,-,/,*,%,++,--
		//assignment operators: =
		//comparison operators: <,>,<=,>=,!=(is not),==
		//logical operators: && (and), || (or), ! (not),
		
		
		

		
		//java logic
		System.out.println(10<9);
		
		
		
		
	}

}
