package arrays.Medium;

import java.util.Arrays;

public class RearrangePostiveAndNegativeNumbers {

	public static void main(String[] args) {
		/*
		 * https://www.codingninjas.com/studio/problems/alternate-numbers_6783445?
		 * utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&
		 * leftPanelTab=0
		 * 
		 * https://www.youtube.com/watch?v=h4aBagy4Uok&list=
		 * PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz&index=25
		 * 
		 */
		int[] a = { -3, -2, -5, 1, 2, 4 };
		System.out.println(Arrays.toString(alternateNumbers(a)));

	}

	public static int[] alternateNumbers(int[] a) {

		int[] resultantArray = new int[a.length];
		int posIndex = 0;
		int negIndex = 1;
		int i = 0;
		while (i < a.length) {

			if (a[i] > 0) {
				resultantArray[posIndex] = a[i];
				posIndex = posIndex + 2;
				i++;
			} else {
				resultantArray[negIndex] = a[i];
				negIndex = negIndex + 2;
				i++;
			}

		}

		return resultantArray;
	}

}
