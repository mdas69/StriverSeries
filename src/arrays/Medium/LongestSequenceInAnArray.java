package arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSequenceInAnArray {

	public static void main(String[] args) {
		int[] arr = { 15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3 };
		System.out.println(longestSuccessiveElements(arr));
	}

	public static int longestSuccessiveElements(int[] a) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Boolean> hmap = new HashMap<>();
		for (int nums : a) {
			hmap.put(nums, true);
		}

		for (int nums : a) {
			if (hmap.containsKey(nums - 1))
				hmap.put(nums, false);
		}

		int maxCount = 1;
		for (int i = 0; i < a.length; i++) {
			if (hmap.get(a[i]) == true) {
				int next = 1;
				int count = 1;
				while (hmap.containsKey(a[i] + next)) {

					count = count + 1;
					maxCount = Math.max(maxCount, count);
					next++;
				}
			}
		}
		return maxCount;

	}

}
