package patternSeries;

public class Q12 {

	public static void main(String[] args) {

		int n = 4;
		for (int i = 1; i <= n; i++) {

			// number
	
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				

			}
			// space
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// number
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			// next line
			System.out.println();
		}

	}

}
