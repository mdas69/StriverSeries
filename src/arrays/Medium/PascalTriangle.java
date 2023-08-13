package arrays.Medium;

public class PascalTriangle {

	public static void main(String[] args) {

		for (int i = 1; i <=6; i++) {
			generateRows(i);
			System.out.println();
		}

	}

	/*
	 * To generate all the elements for a particular row
	 */
	public static void generateRows(int rows) {

		int ans = 1;
		System.out.print(ans+" ");
		
		for (int col = 1; col < rows; col++) {
			ans = ans * (rows - col);
			ans = ans / col;
			System.out.print(ans+" ");

		}

	}

}
