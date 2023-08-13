package arrays.Medium;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 2, 1, 1, 1, 3, 3 };
		System.out.println("majority of element " + OptimalSolution2(arr));
	}

	public static int  OptimalSolution2(int[] v) {

		int count = 1;
		int majority = v[0];

		for (int i = 1; i < v.length; i++) {
			if (v[i] == majority) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {

				majority = v[i];
				count = 1;
			}

		}
		return majority;

	}

	public static int majorityElement(int[] v) {

		int c = 0;
		int e = -10000;
		int n = v.length;
		for (int i = 0; i < n; i++) {
			if (c == 0) {
				e = v[i];
				c = 1;
			}

			else if (v[i] == e) {
				c++;
			} else
				c--;
		}

		return e;
	}

}
