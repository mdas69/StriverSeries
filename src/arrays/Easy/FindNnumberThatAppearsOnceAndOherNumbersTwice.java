package arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class FindNnumberThatAppearsOnceAndOherNumbersTwice {

	public static void main(String[] args) {
		// solution1();
		//System.out.println(Optimalsolution());

		int[] arr = { 4, 2, 1, 6, 1, 4, 6 };
		//UniqueElementInAnArrayofDuplicates(arr);
		
		solution2();
	}

	/*
	 * In Java, you can perform the XOR (exclusive OR) operation using the ^
	 * operator. The XOR operation returns true if the two operands are different
	 * (one true and one false), otherwise, it returns false.
	 * 
	 */

	public static int Optimalsolution() {
		int a[] = { 1, 1, 3, 3, 5, 5, 6 };
		int xor = 0;
		for (int nums : a) {

			xor = xor ^ nums;

		}
		return xor;
	}

	public static int UniqueElementInAnArrayofDuplicates(int[] arr) {
		int unique = 0;
		int n = arr.length;
		// {4, 2, 1, 6, 1, 4, 6};
		for (int i = 0; i < n; i++) {

			unique = unique ^ arr[i];
			System.out.println(unique);
		}
		return unique;

	}

	/**
	 * Your time complexity: O(n) : not accepted
	 * 
	 * @return
	 */
	public static int solution1() {
		int a[] = { 1, 1, 3, 3, 4, 5, 5, 5, 6 };

		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int nums : a) {

			if (hmap.containsKey(nums)) {
				hmap.put(nums, hmap.get(nums) + 1);
			} else {
				hmap.put(nums, 1);
			}
		}
		int singleEle = 0;
		for (Map.Entry<Integer, Integer> kv : hmap.entrySet()) {
			if (kv.getValue() == 1) {
				System.out.println(kv.getKey());
				singleEle = kv.getKey();

			}

		}
		return singleEle;
	}
	
//If given array is sorted then we can find the unique elements without XOR ing
	public static void solution2() {

		int arr[] = { 2, 2, 3, 3, 10 };
		int n = arr.length;

		int i = 0;
		int j = i + 1;
		int uniqueEle = -1;
		while (j < n) {
			if (arr[i] != arr[j]) {
				uniqueEle = arr[i];
				i++;
				j++;

			}
			else {
				i = i + 2;
				j = j + 2;
			}
			

		}
		
		int ans = uniqueEle ==-1 ?  arr[n-1] : uniqueEle ;
		System.out.println(ans);

	}

}
