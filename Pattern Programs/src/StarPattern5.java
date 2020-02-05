import java.util.Scanner;

public class StarPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new  Scanner(System.in);
		System.out.println("Enter any number below 10 = ");
		int num = input.nextInt();
		System.out.println("## Star Pattern loading... ##");
		System.out.println();

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = num; k >= i; k--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}

//Output>>>

/*

Enter any number below 10 = 
5
## Star Pattern loading... ##

*****
 ****
  ***
   **
    * 

*/