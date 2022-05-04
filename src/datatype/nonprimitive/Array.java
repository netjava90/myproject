package datatype.nonprimitive;

public class Array {

	public static void main(String[] args) {
		//array is a variable that can hold multiple values in the same time
		//syntax; variableType[] arrayName = {value1, value2, value 3...}
		
		//declare and assign an array in one line
		int [] myArray = {2, 5, 7, 3, 9};
		//System.out.println(myArray[0]);
		
		//System.out.println(myArray[4]);
		
		//declare an array
		int [] array1 = new int[6];
		//assign an array
		array1[0] = 9;
		array1[1] = 2;
		array1[2] = 0;
		array1[3] = 1;
		array1[4] = 7;
		array1[5] = 10;
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
			//max of the array is equal to array1.length
			//System.out.println(i);
			//array out of bound exception if the last element doesn't exists and java try to print it
		}

	}

}
