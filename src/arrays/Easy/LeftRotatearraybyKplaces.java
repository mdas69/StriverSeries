package arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotatearraybyKplaces {

	public static void main(String[] args) {
		//solution();
		solution1();
	}

	public static void solution() {

		int a[] = { 22, 33, 44, 55, 66, 77, 30, 45 };
		// int rotate by k place
		int k = 3;

		// expected o/p
		// 55,66,77,30,45,22,33,44

		int start1 = 0;
		int end1 = k - 1;

		int start2 = k;
		int end2 = a.length - 1;

		int start = 0;
		int end = a.length - 1;

		System.out.println(Arrays.toString(reverse(a, start1, end1)));
		System.out.println(Arrays.toString(reverse(a, start2, end2)));
		System.out.println(Arrays.toString(reverse(a, start, end)));

	}

	public static void solution1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		  
		int k = sc.nextInt();
		if(k>arr.length){
			k = k%arr.length;
		}
		
		int start1 = 0;
		int end1 = k - 1;

		int start2 = k;
		int end2 = arr.length - 1;

		int start = 0;
		int end = arr.length - 1;

		System.out.println(Arrays.toString(reverse(arr, start1, end1)));
		System.out.println(Arrays.toString(reverse(arr, start2, end2)));
		System.out.println(Arrays.toString(reverse(arr, start, end)));


	}

	public static int[] reverse(int[] a, int start, int end) {
		while (start <= end) {
			int temp = a[end];
			a[end] = a[start];
			a[start] = temp;

			start++;
			end--;
		}

		return a;

	}

}
