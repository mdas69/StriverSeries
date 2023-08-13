package arrays.Easy;

import java.util.*;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		// bruteSolution();
		int a[] = { 1, 2, 3, 3 };
		int b[] = { 2, 2, 4 };
		optimalSolution(a, b);
	}

	public static void optimalSolution(int a[], int b[]) {

		int i = 0;
		int n1 = a.length;

		int j = 0;
		int n2 = b.length;
		ArrayList<Integer> Union = new ArrayList<>();

		while (i < n1 && j < n2) {
			if (a[i] <= b[j]) {
				if (!(Union.contains(a[i]))) {
					Union.add(a[i]);
					i++;
				}
				else i++;

			} else if (b[j] <= a[i]) {
				if (!(Union.contains(b[j]))) {
					Union.add(b[j]);
					j++;
				} 
				else j++;
				
			}

		}

		while (i < n1) {
			// put all ele from a[] to Union list
			if (!(Union.contains(a[i]))) {
				Union.add(a[i]);
			}
			i++;

		}

		while (j < n2) {
			// put all ele from b[] to Union list
			if (!(Union.contains(b[j]))) {
				Union.add(b[j]);
			}

			j++;

		}

	}

	public static void bruteSolution() {

		int b[] = { 1, 1, 2, 3, 3, 45, 56 };
		int a[] = { 2, 3, 45, 56, 7 };

		int size = a.length > b.length ? a.length : b.length;
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < size; i++) {

			if ((i < a.length) && (i < b.length)) {
				set.add(a[i]);
				set.add(b[i]);
			} else if (i >= b.length) {
				set.add(a[i]);
			} else if (i >= a.length) {
				set.add(b[i]);
			}

		}

	}

}
