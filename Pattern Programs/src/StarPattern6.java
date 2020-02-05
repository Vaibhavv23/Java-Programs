
public class StarPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 5; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(" ");
			}
			for(int c = 4; c >= a; c--) {
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