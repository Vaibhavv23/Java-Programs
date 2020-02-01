//Program to Find the Factorial of the Number Using increment operator

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Factorial of = ");
		int a = input.nextInt();
		int fact = 1;
		
		for(int i = 1; i <= a; i++) { 
			fact = fact * i;
			System.out.println(fact);
		}
	}
}


/*
//Program to Find the Factorial of the Number Using decrement operator

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Factorial of = ");
		int a = input.nextInt();
		int fact = 1;
		
		for(int i = a; i >= 1; i--) { 
			fact = fact * i;
			System.out.println(fact);
		}
	}
}
*/
