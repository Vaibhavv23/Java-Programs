
public class StarPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				if(i >= 2 && j <= i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int a = 1; a <= 5; a++) {
			for(int b = 4; b >= a; b--) {
				System.out.print(" ");
			}
			for(int c = 1; c <= a; c++) {
				if(a >= 2 && c > 1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

//Output>>>

/*

Enter any number below 10 = 
5
## Star Pattern loading... ##

*
 *
  *
   *
    *


    *
   * 
  *  
 *   
*    

*/