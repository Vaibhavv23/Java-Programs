//Program to Reverse A String in Java

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to be reversed = ");
		String name = input.next();
		String rev = "";
		int i = 0;
		int len = name.length();
		
		for(i=len-1; i>=0; i--) {
			rev = rev + name.charAt(i);
		}System.out.println(rev);
	}
}
