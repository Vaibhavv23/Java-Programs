//Program to Create Calculator using switch case

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn; 
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter no1 = ");
			int no1 = input.nextInt();
			System.out.println("Enter no2 = ");
			int no2 = input.nextInt();
			System.out.println("Enter the opeation(+,-,*,/) you want to perform = ");
			String op = input.next();
			int res;
			
			switch(op) {
			case "+":
				res = no1 + no2;
				System.out.println("Addition is = " +res);
				break;
			case "-":
				res = no1 - no2;
				System.out.println("Substraction is = " +res);
				break;
			case "*":
				res = no1 * no2;
				System.out.println("Multiplication is = " +res);
				break;
			case "/":
				res = no1 / no2;
				System.out.println("Division is = " +res);	
			    break;
			default:
				System.out.println("Invalid");
				break;
		    }System.out.println("Do you want to continue? y for yes and n for no.");
		     yn = input.next();
		}while(yn.equals("y")||yn.equals("Y"));
		 if(yn.equals("n")||yn.equals("N")) {
			 System.out.println("Program end.");
		 }	
	}
}