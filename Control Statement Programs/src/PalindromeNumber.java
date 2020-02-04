//Program To Check for Palindrome Number

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome or not = ");
		int num = input.nextInt();
		
		int temp = num;
		int rev = 0, rem;
		while(temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if(rev == num) { // matching the actual num with its reverse
			System.out.println(num +" is a palindrome");
		}else {
			System.out.println(num +" is not a palindrome");
		}
	}
}

//Palindrome number program is based on Reverse number program.