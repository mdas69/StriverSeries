package arrays.Easy;

public class MoveZerostoend {

	public static void main(String[] args) {
		//Solution();
		Solution2();
	}

	public static void Solution2() {
		int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		int i = 0;

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == 0) {
				i++;
				break;
			}
		}

		int j = i + 1;

		while (j < arr.length) {
			if (arr[j] != 0) {
				// swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++; j++;
			} else
				j++;
		}

	}

	public static void Solution() {
		int a[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		int n = a.length;
		int start = -1;
		int end;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				start = i;
				break;
			}
		}

		if (start > -1) {
			end = start + 1;

			while (end < a.length) {

				if (a[end] != 0) {
					// swap
					int temp = a[end];
					a[end] = a[start];
					a[start] = temp;

					end++;
					start++;
				}

				else
					end++;
			}

		}
	}
}
