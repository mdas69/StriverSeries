package arrays.Easy;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// System.out.println(solution1());
		removeDuplicatesArray();
		ArrayList<Integer> list = new ArrayList<>();
		int[] a = { 1, 1, 2, 3, 3, 3, 4 };

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);

		}

		//System.out.println("unique elements = " + removeDuplicates(list, list.size()));
	}

	public static void removeDuplicatesArray() {
		int i = 0;
		int j = 1;
		int a[] = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
		while (j < a.length) {

			if (a[i] != a[j]) {

				a[i + 1] = a[j];i++;
			}
			j++;

		}

	}

	public static int removeDuplicates(ArrayList<Integer> arr, int n) {

		int i = 0;
		int j = 1;

		while (j < n) {

			if (arr.get(i) != arr.get(j)) {

				arr.set(i + 1, arr.get(j));
				i++;
			}

			j++;
		}
		return i + 1;
	}

	// to find the unique elements present in the array
	public static int solution1() {
		int[] arr = { 1, 1, 2, 2, 2, 3 };

		int start = 0;
		int uniqueElem = 1;
		while (start < arr.length) {
			if ((start != arr.length - 1) && arr[start] != arr[start + 1]) {
				uniqueElem++;
			}
			start++;
		}
		return uniqueElem;

	}

}
