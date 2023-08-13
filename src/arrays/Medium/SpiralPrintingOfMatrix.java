package arrays.Medium;

import java.util.Arrays;

public class SpiralPrintingOfMatrix {

	public static void main(String[] args) {

		int[][] MAT = { { 5, 60, 28 }, { 14, 58, 1440 }, { 28, 1, 67 }, { 57, 23, 3030 }, { 1, 60, 3134 } };

		int[] Spiralmat = spiralMatrix(MAT);
		System.out.println(Arrays.toString(Spiralmat));
	}

	public static int[] spiralMatrix(int[][] MATRIX) {

		int rows = MATRIX.length;
		int cols = MATRIX[0].length;
		int c = 0;

		int mat[] = new int[rows * cols];

		int top = 0;
		int left = 0;
		int right = cols - 1;
		int bottom = rows - 1;
		while (top <= bottom && left <= right) {
			// left to right
			for (int i = left; i <= right; i++) {
				mat[c] = MATRIX[top][i];
				c++;
			}
			top++;

			// top to bottom
			for (int i = top; i <= bottom; i++) {
				mat[c] = MATRIX[i][right];
				c++;

			}
			right--;

			if (bottom >= top) {
				// right to left
				for (int i = right; i >= left; i--) {
					mat[c] = MATRIX[bottom][i];
					c++;
				}
			
			bottom--;
			}

			if (right >= left) {
				// bottom to top
				for (int i = bottom; i >= top; i--) {
					mat[c] = MATRIX[i][left];
					c++;
				}
			}
			left++;

		}

		return mat;

	}

}
