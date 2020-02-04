//Program to Print Fibonacci Series Using Recursion

import java.util.Scanner;

public class FibonacciSeriesUsingRec {

	static int a = 0, b = 1, c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number to print fibonacci series = ");
		int num = input.nextInt();
		
		System.out.print(a +" "+ b);
		FibonacciSeriesUsingRec ob = new FibonacciSeriesUsingRec();
		ob.printFib(num);
	}
	void printFib(int num){
		if(num >= 1) {
			c = a + b;
			System.out.print(" "+ c);
			a = b;
			b = c;
			printFib(num-1);	
		}
	}
}
