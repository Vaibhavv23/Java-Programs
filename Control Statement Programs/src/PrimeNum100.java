//Program to print prime numbers between 1 to any input number

import java.util.Scanner;

public class PrimeNum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the any number to print primes before it = ");
		int num = input.nextInt();
		int i,j = 0; // static variables
		
		for(i = 2; i <= num; i++) {
			boolean flag = true; // local variable not static
			for(j = 2; j <= i-1; j++) {
				if(i % j == 0) {
					flag = false; // it means we did not get prime
					break;
				}
			}
			if(flag == true) {
				System.out.println(i);
			}
		}
	}
}
