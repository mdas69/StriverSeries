package patternSeries;

public class Q18 {

	public static void main(String[] args) {
	
		Solution2(3);
	

	}
	
	public static void Solution2(int n){
		/*
		 *  C 
			C B 
			C B A 
		 */
		
		int n1 = 3;
		// My Approach
	
		for (int i = 0; i < n1; i++) {
			int ch = 'A'+(n1-1); 
			for (int j = 0; j < (i + 1); j++) {
				System.out.print((char) ch+" ");
				ch --;
			}
			System.out.println();
		}
	}
	
	public  static void Solution1(int n) {
		/*	
		 * E 
		   D E 
		   C D E 
		   B C D E 
		   A B C D E 
		 */
			
			// My Approach
			for (int i = 0; i < n; i++) {
				int ch = 'A'+(n-1) - i;
				for (int j = 0; j < (i + 1); j++) {
					System.out.print((char) ch+" ");
					ch ++;
				}
				System.out.println();
			}
	}

}
