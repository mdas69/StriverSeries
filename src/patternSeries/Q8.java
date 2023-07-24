package patternSeries;

public class Q8 {

	public static void main(String[] args) {
		solution(5);

	}
	
	public static void solution(int n) {

		for (int i = 0; i < n; i++) {

			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j < ((2*n-1)-2*i) ; j++) {
				System.out.print("*");
			}

			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}

	}

}
