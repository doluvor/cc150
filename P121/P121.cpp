#include <iostream>

using namespace std;

class SolutionGreedy {
public:
	int maxProfit(vector<int>& prices) {
		
		const int size = prices.size();

		if (size < 2) {
			return 0;
		}
		
		int maxProfit = 0;
		
		int minPrice = prices[0];

		for (int i = 1; i < size; i++) {
			
			const int current = prices[i];
			
			if (current - minPrice > maxProfit) {
				maxProfit = current - minPrice;
			}
			
			if (current < minPrice) {
				minPrice = current;
			}
		}
		
		return maxProfit;
	}
};

int main(int argc, char *argv[]) {
	
}
