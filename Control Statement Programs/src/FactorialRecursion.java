//Program to Find the Factorial of the Number using Recursion

import java.util.Scanner;

public class FactorialRecursion {
	
    int fact = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find factorial = ");
		int num = input.nextInt();
		
		FactorialRecursion f = new FactorialRecursion();
		int res = f.calFact(num);
		System.out.println(res);
	}
	int calFact(int num) {
		if (num > 1) {
			fact = fact * num;
			calFact(num - 1);
		}return fact;
	}
}
