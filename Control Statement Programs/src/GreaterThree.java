//Program to find Greater between Three Numbers.

import java.util.Scanner;

public class GreaterThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of 'a' = ");
		int a = input.nextInt();
		System.out.println("Enter value of 'b' = ");
		int b = input.nextInt();
		System.out.println("Enter value of 'c' = ");
		int c = input.nextInt();
		
		if(a > b && a > c) {
			System.out.println("a is greater");
		}else if(b > a && b > c){
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}	
	}
}
