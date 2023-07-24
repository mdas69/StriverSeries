package patternSeries;

public class Q17 {

	public static void main(String[] args) {
		//solution1(3);
		solution1(5);
	}

	/*
	 * striver
	 */
	public static void solution2(int n) {
		for (int i = 0; i < n; i++) {

			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// number
			char ch1 = 'A';
			int breakpoint = (2 * i + 1 / 2) + 1;
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(ch1);
				if (j < breakpoint) 	ch1++;
				else ch1--;
				
				ch1++;
			}

			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
		}

	}

	/*
	 * my approach is lengthy 
	 */
	public static void solution1(int n) {

		for (int i = 0; i < n; i++) {

			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// no1
			char ch1 = 'A';
			for (int j = 0; j < i + 1; j++) {
				System.out.print(ch1);
				ch1++;
			}

			// no2
			int ch2 = 'A' + i - 1;
			for (int j = 0; j < i; j++) {
				System.out.print((char) ch2);
				ch2--;
			}

			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
