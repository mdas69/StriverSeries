package arrays.Easy;

import java.util.Arrays;

public class TwoSumProblem {

	public static void main(String[] args) {
		int[] book = { 1, 2 };
		betterSolution(2, book, 1);
		optimalSolution(2,book,1);
	}

	/*
	 * Trick: Sorting the array and taking 2 pointers one at start and one the end.
	 * if target > sum (j--) else i++; till i==j 
	 */
	public static String optimalSolution(int n, int[] book, int target) {

		
		int i = 0;
		int j = book.length - 1;
		Arrays.sort(book);
		boolean flag = false;
		while (i < j) {
			if (book[i] + book[j] == target) {
				flag = true;
				break;
			} else if (book[i] + book[j] < target)
				i++;
			else
				j++;
		}

		String YES = "YES";
		String NO = "NO";
		return flag ? YES : NO;
	}

	/*
	 *The below is a better solution as no extra space was taken, however time complexity is O(N)
	 * for first while loop and (O(n-j) for second loop
	 */

	public static String betterSolution(int n, int[] book, int target) {
		int res = 0;
		int i = 0;
		boolean flag = false;
		while (i < n) {

			if ((target - book[i]) >= 0) {
				res = target - book[i];
				int j = i + 1;
				while (j < n) {
					if (book[j] == res) {
						flag = true;
						// if want to return the index then simply return j
						break;
					}
					j++;
				}

			}
			i++;
			if (flag)
				break;

		}

		String YES = "YES";
		String NO = "NO";
		return flag ? YES : NO;

	}

}
