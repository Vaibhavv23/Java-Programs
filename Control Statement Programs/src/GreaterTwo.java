//Program to find Greater between Two Numbers.

import java.util.Scanner;

public class GreaterTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of 'a' = ");
		int a = input.nextInt();
		System.out.println("Enter value of 'b' = ");
		int b = input.nextInt();
		
		if(a > b) {
			System.out.println("a i.e.."+ a +" is greater.");
		}else {
			System.out.println("b i.e.."+ b +" is greater.");
		}		
	}

}
