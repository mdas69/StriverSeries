package arrays.Medium;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		int n = 6;
		int arr1[] = { 10, 20, -30, 40, -50, 60 };
		// System.out.println("The max subArray sum would be " + maxSubarraySum(arr,
		// n));
		// int arr2[] = { -2, -3, 4, -1, -2, 1, 5, 3 };

		int arr3[] = { 2, 5, -7, 1, 3, 5 };
		// System.out.println("The max subArray sum would be:: "+ maxSubarraySum(arr2,
		// arr2.length));
		// printingTheSubArray(arr3, arr3.length);

		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray1(nums));

	}

	public static int maxSubArray1(int[] nums) {

		int sum = nums[0];
		int maxSum = nums[0];
		int i = 1;
		while (i < nums.length) {
			if (sum>=0){
				sum = sum + nums[i];
			}
			else  {
				sum = nums[i];
			}
			maxSum = Math.max(maxSum, sum);
			i++;
		}
		return maxSum;
	}

	public static void printingTheSubArray(int[] arr, int n) {

		int sum = 0;
		int res = 0;
		int s = 0;
		int e = 0;
		int startIndex = 0;
		int i = 0;
		while (i < n) {

			if (sum == 0)
				s = i;

			sum = sum + arr[i];

			if (sum < 0) {
				sum = 0;

			}

			else if (res < sum) {
				res = sum;
				e = i;
				startIndex = s;
			}

			i++;

		}

		System.out.println("index start " + startIndex);
		System.out.println("index end " + e);
	}

	/*
	 * 
	 */

	public static long maxSubarraySum(int[] arr, int n) {

		int sum = 0;
		int res = 0;
		int i = 0;
		while (i < n) {
			sum = sum + arr[i];
			i++;

			if (res < sum) {
				res = sum;

			} else if (sum < 0) {
				sum = 0;
			}
		}
		return res;
	}

}
