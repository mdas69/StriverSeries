package arrays.Basic;

public class LargestElementinanArray {
	/*
	 * https://www.codingninjas.com/studio/problems/largest-element-in-the-array-
	 * largest-element-in-the-array_5026279	
	 */
	public static void main(String[] args) {

	}

	public static int largestElement(int[] arr, int n) {
		int start = 0;
		int cursor = 1;
		int res = 0;

		while (cursor <= arr.length - 1) {

			if (arr[start] <= arr[cursor]) {
				res = arr[cursor];
				start = cursor;
				cursor++;
			} else {
				cursor++;
			}

		}

		return arr[start] > res ? arr[start] : res;
	}

}
