package patternSeries;

public class Q16 {

	public static void main(String[] args) {
		int n = 5;
		int alph = 'A';
		for (int i = 1; i <= n; i++) {
		
			for (int j = 1; j <= i; j++) {
				System.out.print((char)alph + " ");
				
			}
			alph++;
			System.out.println();

		}

	}

}
