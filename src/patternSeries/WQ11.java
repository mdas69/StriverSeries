package patternSeries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WQ11 {
	


	    public static void main(String[] args) {
	        int[] A = {1,2,3,4,2,3,3,2};

	        Map<Integer, Integer> digitOccurrences = new HashMap<>();
	        Set<Integer> periodicDigits = new HashSet<>();

	        for (int digit : A) {
	            if (digitOccurrences.containsKey(digit)) {
	                digitOccurrences.put(digit, digitOccurrences.get(digit) + 1);
	            } else {
	                digitOccurrences.put(digit, 1);
	            }
	        }

	        for (Map.Entry<Integer, Integer> entry : digitOccurrences.entrySet()) {
	            if (entry.getValue() >= 2) {
	                periodicDigits.add(entry.getKey());
	            }
	        }

	        int periodicDigitCount = periodicDigits.size();

	        System.out.println("Count of periodic digits: " + periodicDigitCount);
	        System.out.println("Periodic digits:");

	        for (int periodicDigit : periodicDigits) {
	            System.out.print(periodicDigit + " ");
	        }
	    }
	}
