package binarySearch;

import java.util.ArrayList;

public class FirstAndLastOccourence {

	public static void main(String[] args) {

		String input = "0 1 2 3 3 3 3 3 3 4 5 ";

		ArrayList<Integer> integerList = new ArrayList<>();
		String[] numbers = input.split(" ");

		for (String number : numbers) {
			integerList.add(Integer.parseInt(number));
		}
		firstAndLastPosition(integerList, integerList.size(),1);
	}

	public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
		
		int count[] = new int[2];
		Integer [] a = arr.toArray(new Integer[arr.size()]);
		count[0] = firstOccurence(a, k);
		count[1] = lastOccurence(a, k);

		return count;

	}

	public static int firstOccurence(Integer [] a, int k) {
		int start = 0; int end = a.length-1; int res =-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(a[mid]==k) res = mid;
			
			if(a[mid]>=k) end =mid-1;
			else start = mid+1;
		}

		return res;
	}

	public static int lastOccurence(Integer [] a, int k) {
		int start = 0; int end = a.length-1; int res =-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(a[mid]==k) res = mid;
			
			if(a[mid]<=k) start =mid+1;
			else  end =mid-1;
		}
		return res;
	}
}
