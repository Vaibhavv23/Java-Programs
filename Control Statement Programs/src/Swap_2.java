//Program to Swap Two Numbers Without Using Third Variable

import java.util.Scanner;

public class Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 'a'= ");
		int a = input.nextInt();
		System.out.println("Enter 'b'= ");
		int b = input.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swaping, 'a'= " + a);
		System.out.println("After swaping, 'b'= " + b);
	}
}
