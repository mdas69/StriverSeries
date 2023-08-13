package arrays.Medium;

import java.util.HashMap;

public class LongestAndNumberOfSubArrayWithSumK {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
		System.out.println("The Longest SubArray - Size that can have sum K : "+longestSubArraySumK(arr, 3));
		System.out.println("Number of SubArrays that can have sum K :"+NumberOfSubArrayWithSumK(arr, 3));
		
	}

	public static int longestSubArraySumK(int arr[], int k) {
		int maxLen = 0;
		int i = 0;
		int sum = 0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
		while (i < arr.length) {

			sum = sum + arr[i];
			if (sum == k) {
				maxLen = Math.max(maxLen, i + 1);
				// printing(arr, 0, i);
			}

			int prefixSum = sum - k;
			if (hmap.containsKey(prefixSum)) {
				maxLen = Math.max(maxLen, i - (hmap.get(prefixSum)));

				// printing(arr, hmap.get(prefixSum) + 1, i);
			}

			if (!hmap.containsKey(sum))
				hmap.put(sum, i);

			i++;
		}

		return maxLen;
	}

	public static int NumberOfSubArrayWithSumK(int[] arr, int k) {
		int count = 0;
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();
		frequencyMap.put(0, 1);
		int sum = 0;
		int i = 0;

		while (i < arr.length) {
			sum = sum + arr[i];

			int prefixSum = sum - k;
			if (frequencyMap.containsKey(prefixSum)) {
				count = count + frequencyMap.get(prefixSum);

				if (frequencyMap.containsKey(sum)) 
					frequencyMap.put(sum, frequencyMap.get(prefixSum) + 1);
				else 
					frequencyMap.put(sum, 1);
			}

			else if (frequencyMap.containsKey(sum)) {
				frequencyMap.put(sum, 1);
			}
			
			i++;
		}

		return count;
	}

	public static void printing(int arr[], int start, int end) {

		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
