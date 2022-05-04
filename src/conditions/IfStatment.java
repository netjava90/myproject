package conditions;

import java.util.Scanner;

public class IfStatment {

	public static void main(String[] args) {
		//capture the user input
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number: ");
        int x = sc.nextInt();
        
        //String str = sc.nextLine();
        //Char     = sc.nextcharAt();
	// int x = 5;
		if (x>0){
			System.out.println("this number is positive");
		} else if (x < 0) {
			System.out.println("this number is negative");
			
		} else {System.out.println("this number is equals to 0");
			
		}
	// you can use if condition only
		
	// if (condition){body}else if {body}
		
	// if (condition) {body} else {body}
		
	// if (condition) {body} else if (condition) {body} ....else {body}
		

	}

}
