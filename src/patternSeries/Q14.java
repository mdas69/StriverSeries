package patternSeries;

public class Q14 {

	public static void main(String[] args) {

		
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int alph = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print((char)alph + " ");
				alph++;
			}
			System.out.println();

		}

	}

}
