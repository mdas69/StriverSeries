package arrays.Medium;

import java.util.Arrays;

public class mergeTwoSortedArrays {

	public static void main(String[] args) {
		long a[] = {0 ,6 ,6 ,6, 6 ,6, 7, 8  };
		long b[] = { 5, 5, 6, 6 ,8  };
		//mergeTwoSortedArraysWithExtraSpace(a, b);
		mergeTwoSortedArraysWithOutExtraSpace(a, b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

	public static void mergeTwoSortedArraysWithOutExtraSpace(long[] a, long b[]) {
		int alen = a.length;
		int blen = b.length;
		int n = (alen + blen);

		int gap = n / 2 + n % 2;
		while (gap >= 1) {
			int left = 0;
			int right = gap + left;
			while (right < n) {

				// left pointer is on->A right pointer is on ->B
				if (left < alen && right >=alen) 
				{
					if (a[left] > b[right-alen]) 
						swap(a, b, left, right-alen);

					else 
						right++;left++;
				}

				// left and right pointers are both on B array
				else if (left >= alen) 
				{
					if (b[left-alen] > b[right-alen]) 
						swap(b, b, left-alen, right-alen);
					
					else 
						right++;left++;
				}

				// left and right are both on A array
				else if (right < alen) 
				{
					if (a[left] > a[right]) 
						swap(a, a, left, right);
					
					else 
						right++;left++;
				}
			}

			// if right moves out of N, then restart with a new gap
			// if gap is already 1, break out from this loop to avoid infinite looping
			if (gap != 1)
				gap = gap / 2 + gap % 2;
			else
				break;
		}
	}

	public static void swap(long[] a, long[] b, int i, int j) {

		long temp = a[i];
		a[i] = b[j];
		b[j] = temp;
		i++;
		j++;

	}

	public static void mergeTwoSortedArraysWithExtraSpace(long[] a, long[] b) {

		int i = 0;
		int j = 0;

		int n = a.length;
		int m = b.length;
		long arr[] = new long[(n + m)];
		int count = 0;

		while (i < n && j < m) {

			if (a[i] >= b[j]) {
				arr[count] = b[j];
				count++;
				j++;
			} else {
				arr[count] = a[i];
				count++;
				i++;
			}
		}

		while (i < n) {
			arr[count] = a[i];
			count++;
			i++;
		}

		while (j < m) {
			arr[count] = b[j];

			count++;
			j++;
		}

		// putting all the elements back as per order from list to arrays.
		for (int k = 0; k < (n + m); k++) {
			if (k < n)
				a[k] = arr[k];
			else {
				b[k - n] = arr[k];
			}
			count++;

		}

	}
}
