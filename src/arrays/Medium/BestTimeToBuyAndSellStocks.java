package arrays.Medium;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
		ArrayList<Integer> prices = new ArrayList<>();
		int[] nums = { 7, 1, 3, 4, 5, 2 };
		for (int num : nums) {
			prices.add(num);
		}
		System.out.println(maximumProfit(prices));
	}

	public static int maximumProfit(ArrayList<Integer> prices) {

		int i = 1;
		int minimumPrice = prices.get(0);
		int profit = 0;
		while (i < prices.size()) {
			int plStatement = prices.get(i) - minimumPrice;
			profit = Math.max(profit, plStatement);
			minimumPrice = Math.min(minimumPrice, prices.get(i));
			i++;

		}
		return profit;
	}

}
