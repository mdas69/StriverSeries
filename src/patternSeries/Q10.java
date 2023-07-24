package patternSeries;

public class Q10 {

	public static void main(String[] args) {
		// Solution1(9);
		Solution2(5);
	}


	public static void Solution2(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * misunderstood n value as number of rows, its number of highest star in a triangle
	 *    
	 *    *
	 	  **
	 	  ***
	 	  ****
	 	  ***** (n=5) whereas i thought n to be 9
	 	  ****
	 	  ***
	 	  **
	 	  *
	 */
	
	public static void Solution1(int n) {

		for (int i = 0; i < n; i++) {

			if (n / 2 == i) {
				int counter = 0;
				while (counter <= i) {
					System.out.print("*");
					counter++;
				}

			} else if (n / 2 > i) {
				int counter = 0;
				while (counter <= i) {
					System.out.print("*");
					counter++;
				}

			} else if (n / 2 < i) {
				int counter = i;
				while ((n - counter <= n / 2) && (n - counter > 0)) {
					System.out.print("*");
					counter++;
				}
			}
			System.out.println();

		}
	}


}
