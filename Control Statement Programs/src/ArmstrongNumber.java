//Program To Check for Armstrong Number

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong or not = ");
		int num = input.nextInt();
		
		// TO FIND LENGTH OF THE GIVEN NUMBER
		
		int temp1 = num, length = 0;
		while(temp1 != 0) {    // run until quotient becomes zero
			length = length + 1;  // it counts the length of the given number
			temp1 = temp1 / 10;
		}
		
		// RERVERSE THE NUMBER AND ITERATE
		
		int temp2 = num;
		int arm = 0;
		while(temp2 != 0) {
			int rem = 0;
			int mul = 1;
			rem = temp2 % 10;
			for(int i = 0; i < length; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			temp2 = temp2 / 10;
		}
		if(arm == num) {
			System.out.println(num +" is an Armstrong number");
		}else {
			System.out.println(num +" is not an Armstrong number");
		}
	}
}
