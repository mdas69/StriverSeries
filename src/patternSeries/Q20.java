package patternSeries;

public class Q20 {

	public static void main(String[] args) {
		Solution3();
	}

	public static void Solution2() {
		int n = 5;
		int space = 2 * (n - 1);

		for (int i = 1; i <= 2 * n - 1; i++) {

			int stars = i;
			if (i > n)
				stars = 2 * n - i;

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");

			}

			// space
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			if (i <= n)
				space = space - 2;
			else
				space = space + 2;
			if (space < 0)
				space = 2;

			for (int j = 1; j <= stars; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

	public static void Solution1() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// space
			for (int j = 1; j <= (2 * (n - i)); j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i < n; i++) {

			// stars
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			// space
			for (int j = 1; j <= (2 * i); j++) {
				System.out.print(" ");
			}

			// stars
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void Solution3() {
		int n = 5;

		for (int i = 1; i <=2 * n - 1; i++) {

			// star
			int star = i;
			
			//space
			int space =2*n-2*i;
			
			if (i > n)
				{star = 2 * n - i;
				space = -(space);
				}

			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			
			
			for (int j = 1; j <= space; j++) {
				System.out.print("!");
			}
			
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
	
			System.out.println();

		}
	}

}
