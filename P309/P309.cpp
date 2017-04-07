#include <iostream>

class Solution {
public:
	int maxProfit(vector<int>& prices) {
		
		const int size = prices.size();
		
		if (size < 2) {
			return 0;
		}
		
		int sell[size] = {0};
		int buy[size] = {0};
		
		buy[0] = -prices[0];
		sell[0] = 0;
		
		for (int i = 1; i < size; i++) {
			
			int price = prices[i];
			
			sell[i] = max(buy[i-1] + price, sell[i-1]);
			
			if (i < 2) {
				buy[i] = max(buy[i-1], -price);
			} else {
				buy[i] = max(buy[i-1], sell[i-2] - price);
			}
		}
		
		return max(sell[size-1], buy[size-1]);
	}
};

int main(int argc, char *argv[]) {
	
}
