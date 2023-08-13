package arrays.SortingAlgos;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {274, 193, 785 ,785, 63, 799, 206, 701, 236, 972, 391, 368, 381, 271, 935 ,981 ,978, 756 ,898 ,221 ,847 ,759, 164 ,748, 81 ,240, 286 ,211 ,882 ,840 ,357 ,359, 631 ,394 ,411 ,681 ,896, 141, 825 ,631};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr, int start, int end) {

		// base condition
		if (start >= end)
			return;

		int mid =  (end + start) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		mergeFunctions(arr, start, mid, end);

	}

	public static void mergeFunctions(int arr[], int start, int mid, int end) {

		ArrayList<Integer> temp = new ArrayList<>();
		int left = start;
		int right = mid + 1;

		// comparing right and left side arrays
		while (left <= mid && right <= end) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		//if one of the array got over
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right<=end) {
			temp.add(arr[right]);
			right++;
		}
		
		//pushing the elements from temp array to original array
		for(int i=start; i<=end;i++) {
			arr[i]=temp.get(i-start);
		}
		
		
	}

}
