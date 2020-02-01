//Program to Check for Even or Odd Number

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number 'a' = ");
		int a = input.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("a is Even");
		}else {
			System.out.println("a is odd");
		}
	}
}
