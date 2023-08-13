package progs.basic;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMapping {

	public static void main(String[] args) {

		int nums[] = {1,3,4,3,4,1};
		System.out.println(countFrequency(nums.length,nums));
		
	}
	public static int[] countFrequency( int n,int []nums){

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int number : nums){

            if(hmap.containsKey(number))
                hmap.put(number,hmap.get(number)+1 );
            
            else
                hmap.put(number, 1);
            
        }
        
     
        
        int [] intArray = new int[n];
       for(int i=1; i<=n;i++) {
    	   if(hmap.containsKey(i))
    		   intArray[i-1]= hmap.get(i);
        }
        return intArray;
        
      

    }

}
