package arrays.SortingAlgos;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = {274, 193, 785 ,785, 63, 799, 206, 701, 236, 972, 391, 368, 381, 271, 935 ,981 ,978, 756 ,898 ,221 ,847 ,759, 164 ,748, 81 ,240, 286 ,211 ,882 ,840 ,357 ,359, 631 ,394 ,411 ,681 ,896, 141, 825 ,631};
		int end = arr.length - 1;
		quickSort(arr, 0, end);
		System.out.println(Arrays.toString(arr));
	}

	public static int partition(int[] arr, int start, int end) {
		int temp;
		int count = 0;
		int pivot = arr[start];
		for (int i = start + 1; i <= end; i++) {
			if (pivot >= arr[i])
				count++;
		}

		int pivotIndex = count + start;
		// swap
		temp = arr[start];
		arr[start] = arr[pivotIndex];
		arr[pivotIndex] = temp;

		// left aur right part sorting karenge
		int i = 0;
		int j = end;

		while (i < pivotIndex && j > pivotIndex) {

			while (arr[i] < arr[pivotIndex]) {
				i++;
			}

			while (arr[j] > arr[pivotIndex]) {
				j--;
			}

			if (i < pivotIndex && j > pivotIndex) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j--;
			}

		}

		return pivotIndex;
	}

	public static void quickSort(int[] arr, int start, int end) {

		// base condition
		if (start >= end)
			return;

		int p = partition(arr, start, end);

		quickSort(arr, start, p - 1);

		quickSort(arr, p + 1, end);
	}

}
