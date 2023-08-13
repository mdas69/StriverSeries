package arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

	public static void main(String[] args) {
		int arr[] = { 148,162,85,18,107,32 };
		System.out.println(OptimalSolution(arr));

	}

	/*https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
	 * https://www.youtube.com/watch?v=cHrH9CQ8pmY
	 */
	public static List<Integer> OptimalSolution(int[] a) {

		int maxim = Integer.MIN_VALUE;
		List<Integer> superiorElements = new ArrayList<>();
		for (int i = a.length - 1; i >= 0; i--) {

			if(maxim<a[i]&&!(superiorElements.contains(a[i]))) {
				superiorElements.add(a[i]);
				maxim= a[i];
			}
			
			/*
			 * maxim = Math.max(a[i], maxim); if (!(superiorElements.contains(maxim)))
			 * superiorElements.add(maxim);
			 */

		}

		 Collections.sort(superiorElements);
		 return superiorElements;
	}
	
	
	
	public static List< Integer > superiorElements(int []a) {
    List<Integer> list = new ArrayList<>();
    int last = a.length-1;
    int Lastmax =0;
    for(int i=last; i>=0;i--){
        if(i==last) 
        {
            list.add(a[i]);
           Lastmax =  Math.max(a[i],Lastmax);
        }
    else if(!list.contains(a[i]) && a[i]>Lastmax)
    {
            list.add(a[i]);
           Lastmax =  Math.max(a[i],Lastmax);
    }
       
        
    }
    Collections.sort(list);
    return list;
    }

}
