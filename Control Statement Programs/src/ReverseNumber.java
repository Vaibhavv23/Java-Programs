//Program to Reverse a Number

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find Reverse = ");
		int num = input.nextInt();
		int rem, rev = 0;
		
		while(num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}System.out.println(rev);
	}
}
