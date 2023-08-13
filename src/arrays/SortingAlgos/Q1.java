package arrays.SortingAlgos;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {

		int arr[] = { 12, 18, 1, 3, 5, 2, 4, 17 };
		int end = arr.length;
		quickSort(arr, 0, end);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] input, int startIndex, int endIndex) {
		// base condition
		if (startIndex >= (endIndex )) {
			return;
		}
		int p = partition(input, startIndex, endIndex );
		quickSort(input, startIndex, p - 1);
		quickSort(input, p + 1, endIndex );

	}

	public static int partition(int arr[], int start, int end) {
		int pivot = arr[start];
		int count = 0;
		int temp;
		// count pivot is greater than how many elements
		for (int i = start+1; i <= end; i++) {

			if (pivot >= arr[i])
				count = count + 1;
		}
		int pivotIndex = start + count;

		// swap the pivot to its pivotIndex
		temp = arr[start];
		arr[start] = arr[pivotIndex];
		arr[pivotIndex] = temp;


		int i = 0;
		int j = end;
		while (i < pivotIndex && j > pivotIndex) {

			while (arr[i] < arr[pivotIndex])
				i++;
			while (arr[j] > arr[pivotIndex])
				j--;

			if (i < pivotIndex && j > pivotIndex) {
				
					// swap
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j--;
				

			}
		}
		return pivotIndex;
	}

}
