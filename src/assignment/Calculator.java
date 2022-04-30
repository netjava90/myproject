package assignment;

import java.util.Scanner;

public class Calculator {
	int enter;
	double valuec;
	double valuef;

	
	public static void main(String[] args) {
	       System.out.println("--------------------Welcome---------------- ");
	       System.out.println("---Celsius-Fahrenheit/Fahrenheit-Celsius converter--");
	       
	       
		Scanner scan = new Scanner(System.in);
		System.out.println("Celsius-Fahrenheit(1) Fahrenheit-Celsius(2) convertor");
		int click = scan.nextInt();
		
	   
		
		if (click == 1) {
			//convertor C to F
			System.out.println("you choosen option 1");
			System.out.println("please enter the temperature value");
			double valuec = scan.nextDouble();
			double valuef = (valuec * 9/5)+32;
			System.out.println(valuef);
			
				
		}else if(click == 2) {
			//convertor F to C
			System.out.println("you choosen option 2");
			System.out.println("please enter the temperature value");
			double valuef= scan.nextDouble();
			double valuec= (valuef-32)*5/9;
			System.out.println(valuec);
			
			
			
		}else {
			//any other option
			System.out.println("please chose 1 or 2");
			
		
	}
		

			
		
		
        
		
		
		 
		 
		
		
		
		
	
				
		
		
		
		
		
		
		 
			 
			
			
			
			
		
			
			
		}
		
		

	}


