class P121 {
	public static void main(String[] args) {
		
		int[] input = {4, 2, 3, 4, 5};
		int result = maxProfit(input);
		
		System.out.println(result);
	}

	public static int maxProfit(int[] prices) {
		
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for (int i = 0; i < prices.length; i++) {
			
			int profit = prices[i] - minprice;
			if (profit > maxprofit) {
				maxprofit = profit;
			}
			if (prices[i] < minprice) {
				minprice = prices[i];
			}
		}
		
		return maxprofit;
	}
}
