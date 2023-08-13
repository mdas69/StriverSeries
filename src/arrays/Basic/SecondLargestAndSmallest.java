package arrays.Basic;

public class SecondLargestAndSmallest {
	/*
	 * https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-
	 * elements_6581960
	 */
	public static void main(String[] args) {
		// SecondSmallest();
		// SecondLargest();
		ComibnedSolution();
	}

	public static void SecondSmallest() {

		int[] arr = { 16, 111, 2 };

		int smallest = arr[0];
		int secondSmallest = 1000;
		int cursor = 1;
		while (cursor <= arr.length - 1) {

			if (arr[cursor] < smallest) {
				secondSmallest = smallest;
				smallest = arr[cursor];
			}

			else if (arr[cursor] < secondSmallest && arr[cursor] != smallest) {
				secondSmallest = arr[cursor];

			}
			cursor++;
		}
		System.out.println(secondSmallest);

	}

	public static void SecondLargest() {
		int[] arr = { 48, 96, 46, 75, 71, 5, 58, 57 };

		int largest = arr[0];
		int secondLargest = -1000;
		int cursor = 1;
		while (cursor <= arr.length - 1) {

			if (arr[cursor] > largest) {
				secondLargest = largest;
				largest = arr[cursor];
			}

			else if (arr[cursor] > secondLargest && arr[cursor] != largest) {
				secondLargest = arr[cursor];

			}
			cursor++;
		}
		System.out.println(secondLargest);

	}

	public static int[] ComibnedSolution() {
		int a[] = { 3, 4, 5, 2 };
		int smallest = a[0];
		int secondSmallest = 1000;
		int cursor = 1;
		int[] arr = new int[2];
		while (cursor <= a.length - 1) {

			if (a[cursor] < smallest) {
				secondSmallest = smallest;
				smallest = a[cursor];
			}

			else if (a[cursor] < secondSmallest && a[cursor] != smallest) {
				secondSmallest = a[cursor];

			}
			cursor++;
		}
		arr[1] = secondSmallest;

		int largest = arr[0];
		int secondLargest = -1000;
		int cursor1 = 1;
		while (cursor1 <= a.length - 1) {

			if (a[cursor1] > largest) {
				secondLargest = largest;
				largest = a[cursor1];
			}

			else if (a[cursor] > secondLargest && a[cursor1] != largest) {
				secondLargest = a[cursor1];

			}
			cursor1++;
		}
		arr[0] = secondLargest;
		return arr;
	}

}
