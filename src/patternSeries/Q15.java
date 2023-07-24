package patternSeries;

public class Q15 {

	public static void main(String[] args) {
		
		int n=5;
		for (int i = 0; i < n; i++) {
			int alph = 'A';
			for (int j = n; j> i; j--) {
				System.out.print((char) alph +" ");
				alph++;
			}
			System.out.println();

		}
	}

}
