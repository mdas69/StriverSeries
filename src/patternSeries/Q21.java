package patternSeries;

public class Q21 {

	public static void main(String[] args) {
		Solution1(5);
	}

	public static void Solution1(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n) {
					System.out.print("*");
				} 
				
				else
				{
					if (j == 1 || j == n) 
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}
	}

}
