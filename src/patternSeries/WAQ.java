package patternSeries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WAQ {



	    public static int perodicdigit(int N, int[] A) {
	        Map<Integer, Integer> digitOccurrences = new HashMap<>();
	        HashSet<Integer> periodicDigits = new HashSet<>();

	        for (int i = 0; i < N; i++) {
	            int digit = A[i];
	            if (digitOccurrences.containsKey(digit)) {
	                int lastPosition = digitOccurrences.get(digit);
	                int interval = i - lastPosition;
	                if (interval == lastPosition - digitOccurrences.get(digit)) {
	                    periodicDigits.add(digit);
	                }
	            }
	            digitOccurrences.put(digit, i);
	        }

	        System.out.println("Periodic digits:");
	        for (int digit : periodicDigits) {
	            System.out.print(digit + " ");
	        }
	        System.out.println();

	        return periodicDigits.size();
	    }

	    public static void main(String[] args) {
	      int A[] = {1,2,3,4,2,3,3,2};

	        int result = perodicdigit(8, A);
	        System.out.println("Count of periodic digits: " + result);

	     
	    }
	}


