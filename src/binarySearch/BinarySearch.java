package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 6, 15, 17, 35 };
		int target = 17;
		System.out.println("index of target found at : " + search(nums, target));

	}

	public static int search(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		int mid = (start + end) / 2;
		int index = -1;
		while (start <= end) {
			mid = (start + end) / 2;

			if (target > nums[mid]) {
				// move towards the right
				start = mid + 1;
			} else if (target < nums[mid]) {
				// move towards the left
				end = mid - 1;
			} else {
				index = mid;
				return index;
			}

		}
		return index;

	}

}
