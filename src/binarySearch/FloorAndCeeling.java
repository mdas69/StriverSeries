package binarySearch;

import java.util.Arrays;

public class FloorAndCeeling {

	public static void main(String[] args) {
		int arr[] = { 48, 26, 2, 6, 10, 48, 11, 21, 47, 50, 50, 45, 43, 27 };
		int n = arr.length;
		int x = 51;
		System.out.println(ceilingInSortedArray(n, x, arr));

	}

	public static int ceilingInSortedArray(int n, int x, int[] arr) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		int floor = -1;
		int ceil = -1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				floor = arr[mid];
				ceil = arr[mid];
				System.out.print(floor + " ");
				return ceil;

			} else if (arr[mid] < x)
				start = mid + 1;
			else if (arr[mid] > x)
				end = mid - 1;
		}
		if (end < 0)
			floor = -1;
		else
			floor = arr[end];
		if (start > arr.length-1)	ceil = -1;
		else ceil = arr[start];

		System.out.print(floor + " ");
		return ceil;
	}

}
