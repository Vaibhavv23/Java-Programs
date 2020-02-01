//Program to Check for Leap Year

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number 'Year' = ");
		int Year = input.nextInt();
		
		if((Year % 400 == 0) || (Year % 4 == 0 && Year % 100 != 0)) {
			System.out.println("Year is a leap year.");
		}else {
			System.out.println("Year is not a leap year.");
		}
	}
}
