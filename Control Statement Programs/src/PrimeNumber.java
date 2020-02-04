//Program to Check Whether A Number is Prime or Not

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check whether prime or not = ");
		int num = input.nextInt();
		int temp = 0;
		
		for(int i = 2; i <= num-1; i++) {	
			if(num % i == 0) {
				temp = temp + 1; // logic to get out of the loop othewise it will keep printing the same message.
			}
		}
		if(temp > 0) {
			System.out.println("Not a Prime number");
		}else {
			System.out.println("It is a Prime number");
		}
	}
}

//It is more easy to find number which is not a prime than a prime.
//so the above technique is done in that way.