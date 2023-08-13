package arrays.Easy;

public class MissingNumberInAnArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 4 };
		System.out.println(missingNumber(a, 5));
	}

	public static int missingNumber(int[] a, int N) {

		int naturalSum = (N * (N + 1) / 2);
		int sum = 0;

		for (int num : a) {
			sum = sum + num;
		}
		return naturalSum - sum;

	}

}
