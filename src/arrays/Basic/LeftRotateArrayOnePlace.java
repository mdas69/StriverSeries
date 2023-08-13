package arrays.Basic;

import java.util.Arrays;

public class LeftRotateArrayOnePlace {

	public static void main(String[] args) {
		Solution1();
	}

	public static void Solution() {
		int[] arr = { 1, 2, 3, 4, 5 };

		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if ((i != arr.length - 1))	arr[i] = arr[i + 1];
			else arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void Solution1() {
		int[] arr = { 1, 2, 3, 4, 5 };

		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
			arr[arr.length-1] = temp;
		System.out.println(Arrays.toString(arr));
	}

}
