package progs.basic;

import java.util.HashMap;
import java.util.Map;

public class LowestAndHighestFrequencyCount {

	public static void main(String[] args) {
		int[] v = { 10,10,10,3,3,3 };
		getFrequencies(v);
	}

	public static int[] getFrequencies(int[] v) {
		int[] ans = new int[2];
		HashMap<Integer, Integer> hmap = new HashMap<>();

		for (int number : v) {

			if (hmap.containsKey(number))
				hmap.put(number, hmap.get(number) + 1);

			else
				hmap.put(number, 1);

		}
		ans[0] = highestFrequency(hmap);
		ans[1] = lowestFrequency(hmap);
		return ans;
	}

	public static int highestFrequency(HashMap<Integer, Integer> hmap) {
		// find the highest frequency among all the frequency values
		int hf = 1;
		int smallest = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			hf = Math.max(hf, entry.getValue());
		}

		// find the smallest key only for the highest frequency already found above
		for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			if (entry.getValue() == hf)
				smallest = Math.min(smallest, entry.getKey());

		}
		return smallest;

	}

	public static int lowestFrequency(HashMap<Integer, Integer> hmap) {
		// find the lowest frequency among all the frequency values
		int lf = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			lf = Math.min(lf, entry.getValue());
		}

		// find the smallest key only for the lowest frequency already found above
		for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			if (entry.getValue() == lf)
				smallest = Math.min(smallest, entry.getKey());
		}
		return smallest;

	}

}
