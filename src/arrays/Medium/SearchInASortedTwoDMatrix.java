package arrays.Medium;

import java.util.*;

public class SearchInASortedTwoDMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		System.out.println(searchElement(matrix, 30));

		

	}

	public static boolean searchElement(int[][] MATRIX, int target) {

		int i = 0;
		int j = MATRIX[0].length - 1;
		int row = MATRIX.length;
		boolean flag = false;
		while (i < row && j >= 0) {

			if (MATRIX[i][j] < target) {
				i++;
			} else if (MATRIX[i][j] > target) {

				j--;
				/*
				 * instead of going j-- you can invoke binarySearch method since the given
				 * question was row wise sorted. if you found return true, if not found return
				 * false, and increment i++
				 */

			} else {
				flag = true;
				break;
			}

		}

		return flag;
	}

	
}
