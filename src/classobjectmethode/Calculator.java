package classobjectmethode;

import java.util.Scanner;

public class Calculator {

		//java class is blue print (about class and objects)
		//main method is a starting point
		
		//class attributes 
		//1- variables
		int number1 = 10;
		int number2 = 25;
		
		//int length = 654;
		//int width = 100;
		
		
		
		//2 method is reusable block of code that runs when called
		//methodType methodName () {code to execute}
		
		//return methods:
		int sub () {
			int total = number1 - number2;
			return total; 
			
		}
		
		int surface(int length, int width) {
			int total = length * width;
			return total;
			
		}
	
         int cToF(int c) {
        	 int f = (c * 9/5) + 32;
        	 return f;
         }
         
         String myName() {
        	 Scanner sc = new Scanner(System.in);
        	 System.out.println("enter your name");
        	 String name = sc.nextLine();
        	 return name;
        	 
         }
       
         
         //void type no return method
         //non generique use one time only.
         void substration() {
        	 int total = number1 - number2;
        	 System.out.println(total);
        	 
          }
         //generique (give it whatever value you want.
         void addition(int num1, int num2) {
        	 int total = num1 + num2;
        	 System.out.println(total);
        	 
          }
}

         
