//Program to Print Fibonacci Series

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number to print fibonacci series = ");
		int num = input.nextInt();
		
		int a = 0; int b = 1;
		System.out.print(a +" "+ b);
		int c; int i;
		
		for(i = 1; i <= num; i++) {
			c = a + b;
			System.out.print(" "+ c);
			a = b;
			b = c;
		}
	}
}
