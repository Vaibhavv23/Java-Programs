
public class StarPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 5; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(" *");
			}System.out.println();
		}
	}
}

// Alternate way.
/*
public class StarPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= 1; j--) {
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
*/

//Output>>>

/*

Enter any number below 10 = 
5
## Star Pattern loading... ##

     *
    * *
   * * *
  * * * *
 * * * * *
   
*/