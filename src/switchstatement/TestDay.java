package switchstatement;

import java.util.Scanner;

public class TestDay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a day");
		String myday = sc.nextLine();
		Day2 day = new Day2();
		
		
		
		//ENUM IS FOR ENUMERATION
		//day.task(Week.FRI);
		//day.task(Week.TUE);
        day.task(Week.valueOf(myday));
	}

}
