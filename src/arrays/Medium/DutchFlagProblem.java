package arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class DutchFlagProblem {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 2, 2, 0, 0, 0, 1, 2 };
		// OptimalSolution(arr, arr.length);
		//System.out.println(Arrays.toString(OptimalSolution(arr, arr.length)));
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int nums:arr) {
			list.add(nums);
		}
		sortArray(list, list.size());
	}

	
	 public static void sortArray(ArrayList<Integer> arr, int n) {
	        int start =0;
	        int end = arr.size()-1;
	        int cursor = 0;
	        
	        while(cursor<=end )
	        {
	            //cursor = 0
	            if(arr.get(cursor)==0){
	                int temp = arr.get(cursor);
	                arr.set(cursor,arr.get(start));
	                arr.set(start,temp);
	                start++;cursor++; 
	            }

	            //cursor = 1
	            else if(arr.get(cursor)==1) cursor++;


	            //cursor = 2
	           else if(arr.get(cursor)==2){
	                int temp = arr.get(cursor);
	                arr.set(cursor,arr.get(end));
	                arr.set(end,temp);
	                end--;
	            }
	        }
	        
	    }
	 
	 
	public static int[] OptimalSolution(int arr[], int n) {

		int start = 0;
		int end = n - 1;
		int cursor = 0;

		while (cursor <= end) {

			if (arr[cursor] == 2) {

				int temp = arr[cursor];
				arr[cursor] = arr[end];
				arr[end] = temp;
				end--;

			}

			else if (arr[cursor] == 0) {

				int temp = arr[start];
				arr[start] = arr[cursor];
				arr[cursor] = temp;
				start++;
				cursor++;

			} else {
				cursor++;

			}

		}
		return arr;
		
	
	}
}
