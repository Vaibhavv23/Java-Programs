//Program to Print Multiplication Table

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Display table of = ");
		int a = input.nextInt();
	    int x;
	    
		for(x = 1; x <= 10; x++) {
			System.out.println(a +" x "+ x +" = "+ a * x );
		}
	}	
}
