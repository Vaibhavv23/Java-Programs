//Program to Swap Two Numbers Using Third Variable

import java.util.Scanner;

public class Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 'a'= ");
		int a = input.nextInt();
		System.out.println("Enter 'b'= ");
		int b = input.nextInt();
		
		int c = 0;
		c = a;
		a = b;
		b = c;
		
		System.out.println("After swaping, 'a'= " + a);
		System.out.println("After swaping, 'b'= " + b);
	}
}
