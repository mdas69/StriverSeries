package arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		int arr[] = { -5,3,8,-5,10,-5 };

		int nums[] = { -10, 8 ,2, -2};
		System.out.println(":  " + getLongestSubarrayWithSumKPositiveAndNegative(arr, 5) + "\n");
		// System.out.println("AdityVerma: " + longestPositiveSubarrayWithSumK(nums,
		// 0));
	}


		public static int getLongestSubarrayWithSumKPositiveAndNegative(int []nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();
	        int sum = 0;
	        int maxLen = 0;
	        int n = nums.length;
	        for(int i = 0; i < n; i++){
	            sum+=nums[i];
	            if(sum == k){
	                maxLen = Math.max(maxLen, i+1);
	            }
	            int rem = sum - k;
	            if(map.containsKey(rem)){
	                int len = i - map.get(rem);
	                maxLen = Math.max(maxLen, len);
	            }
	            if(!map.containsKey(sum)){
	                map.put(sum, i);
	            }
	        }
	        return maxLen;
		}
	
	

	/*
	 * Aditya Verma
	 */
	public static int longestPositiveSubarrayWithSumK(int[] a, long k) {
		// Write your code here

		/*
		 * assume no negative number in array
		 */

		int i = 0;
		int j = 0;
		int sum = 0;
		int size = 0;

		while (j < a.length) {

			sum = sum + a[j];

			if (sum > k)

			{
				while (!(sum <= k)) {
					sum = sum - a[i];
					i++;
				}

			}

			if (sum == k) {

				int windowSize = j - i + 1;
				// j++;
				if (size < windowSize)
					size = windowSize;
				// size = Math.max(windowSize,size);
			}
			j++;

		}
		return size;
	}

}
