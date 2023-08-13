package arrays.Easy;

import java.util.ArrayList;

public class InteresectionOfTwoSortedArrays {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		int arr3[] = { 1, 2, 2, 2, 3, 4 };
		int arr4[] = { 2, 2, 3, 3 };
		for (int nums : arr3) {
			arr1.add(nums);
		}

		for (int nums : arr4) {
			arr2.add(nums);
		}

		findArrayIntersection(arr1, arr1.size(), arr2, arr2.size());
	}

	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
			int m) {

		int i = 0;
		int j = 0;
		ArrayList<Integer> IntersectionList = new ArrayList<>();
		/* int size = n < m ? m : n; */

		while (i < n && j < m) {

			if (arr1.get(i) == arr2.get(j)) {
				IntersectionList.add(arr1.get(i));
				i++;
				j++;
			} else if (arr1.get(i) < arr2.get(j)) {
				i++;
			} else if (arr1.get(i) > arr2.get(j)) {
				j++;
			}

		}

		return IntersectionList;

	}
}
