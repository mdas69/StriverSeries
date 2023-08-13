package arrays.Medium;

import java.util.ArrayList;

public class FindDuplicateInAnArray {
	/*
	 * You are given an array of integers 'ARR' containing N elements. Each integer
	 * is in the range [1, N-1], with exactly one element repeated in the array.
	 * Your task is to find the duplicate element. The duplicate element may be
	 * repeated twice in the array, but there will be exactly one element that is
	 * repeated in the array.
	 * 
	 * All the integers in the array appear only once except for precisely one
	 * integer which appears two times.
	 * 
	 * Q- 1 3 4 2 2
	 * 
	 * A- 2
	 */

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(1);
		//findDuplicateOf2(arr);
		
		System.out.println(findDuplicateof2orMore());
		

	}

	/*
	 * XOR solution is valid if the number of times the duplicate are there is two
	 * times onlu if three or more then this is not a valid solution.
	 */
	// https://www.codingninjas.com/studio/problems/duplicate-in-array_893397?source=youtube&campaign=love_babbar_codestudio1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio1&leftPanelTab=1
	public static int findDuplicateOf2(ArrayList<Integer> arr) {
		int dup = 0;
		for (int i = 0; i < arr.size(); i++) {
			dup = dup ^ arr.get(i);
			System.out.println(dup);

		}

		for (int i = 1; i < arr.size(); i++) {
			System.out.print(+dup + " ^ " + i);
			dup = dup ^ i;
			System.out.println(" = " + dup);

		}
		return dup;
	}

	public static int findDuplicateof2orMore() {
		int arr[] = { 4, 9, 1, 5, 6, 8, 7, 3, 2, 1 };

		int s = arr[0];
		int f = arr[0];

		do {
			s = arr[s];
			f = arr[arr[f]];
		} while (s != f);

		f = arr[0];
		while (s != f) {
			s = arr[s];
			f = arr[f];

		}
		return s;
	}

}
