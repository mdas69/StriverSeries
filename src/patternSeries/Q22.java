package patternSeries;


/*
 * last question
 */
public class Q22 {

	public static void main(String[] args) {
		Solution1(4);

	}

	public static void Solution1(int n) {

		for (int i = 0; i < 2 * n - 1; i++) {

			for (int j = 0; j < 2 * n - 1; j++) {

				int topdistance = i;
				int leftdistance = j;
				int rightdistance = (2 * n - 2) - j;
				int bottomdistance = (2 * n - 2) - i;

				System.out.print(
						n - Math.min(Math.min(topdistance, bottomdistance), Math.min(leftdistance, rightdistance)));

			}
			System.out.println();
		}
	}

}
