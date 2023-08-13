package arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementN3 {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 1, 3, 1, 1, 3, 1, 1 };
		// System.out.println(majorityElementBetterSolution(arr));
		int arr1[] = { 2,2,2,1,1,1,3,3};

		System.out.println(majorityElementOptimalSolution(arr1));
	}

	public static List<Integer> majorityElementOptimalSolution(int[] v) {
		List<Integer> list = new ArrayList<>();
		int e1 = -10000;
		int c1 = 0;
		int e2 = -10000;
		int c2 = 0;
		for (int i = 0; i < v.length; i++) {
			if (c1 == 0 && v[i] != e2) {
				e1 = v[i];
				c1 = 1;
			}

			else if (c2 == 0 && v[i] != e1) {
				e2 = v[i];
				c2 = 1;
			}

			else if (v[i] == e1)
				c1++;
			else if (v[i] == e2)
				c2++;

			else {
				c1--;
				c2--;
			}

		}
		
		

		c1 = 0;
		c2 = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == e1)
				c1++;
			if (v[i] == e2)
				c2++;
		}

		int mini = (v.length / 3);
		if (c1 > mini)
			list.add(e1);
		if (c2 >  mini)
			list.add(e2);

		return list;
	}
	
	

	/*
	 * https://www.codingninjas.com/studio/problems/majority-element_6915220?
	 * utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&
	 * leftPanelTab=1
	 */
	public static List<Integer> majorityElementBetterSolution(int[] v) {
		// Write your code here
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> hashmap = new HashMap<>();
		for (int i = 0; i < v.length; i++) {

			if (hashmap.containsKey(v[i]) && v.length / 3 != 0) {
				hashmap.put(v[i], hashmap.get(v[i]) + 1);
				if (hashmap.get(v[i]) > v.length / 3 && !hashmap.containsKey(hashmap.get(v[i]))) {
					if (list.size() <= 2) {
						list.add(v[i]);

					}

				}
			} else if (v.length / 3 == 0) {
				list.add(v[i]);
			} else
				hashmap.put(v[i], 1);

		}
		return list;
	}

}
