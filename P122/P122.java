class P122 {
	public static void main(String[] args) {
		
		int[] input = {1, 6, 1, 7, 6};
		int result = maxProfit(input);
		
		System.out.println(result);
	}

	public static int maxProfit(int[] prices) {
		
		if (prices.length < 2) {
			return 0;
		}
		
		int maxprofit = 0;
		
		for (int i = 1; i < prices.length; i++) {
			
			int profit = prices[i] - prices[i - 1];
			if (profit > 0) {
				maxprofit += profit;
			}
		}
		
		return maxprofit;
	}
}