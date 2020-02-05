import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new  Scanner(System.in);
		System.out.println("Enter any number below 10 = ");
		int num = input.nextInt();
		System.out.println("## Star Pattern loading... ##");
		System.out.println();

		for(int i = 1; i <= num; i++) {  // if we try to run 4 loops inside each other it will be an infinite thread.
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int k = 1; k <= num; k++) {
			for(int l = num-1; l >= k; l--) { // num-1 becoz we want 123454321 * not 1234554321.
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

*
**
***
****
*****
****
***
**
*

*/