package arrays.Easy;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		System.out.println(Solution1());
	}

	public static int Solution1() {
		int[] arr = { 0, 0, 1, 1, 1, 1,0,1 };

		int start = 0;
		int maxi = 0;
		int temp = 0;
		while (start<arr.length) {
			if (arr[start] == 0) {
				if(temp>maxi) {maxi = temp;}
				temp =0;
			}
			else {
				temp++;
			}
			start++;
		}
		return temp>maxi?temp:maxi;
	}

}
