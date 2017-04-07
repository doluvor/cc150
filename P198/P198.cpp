#include <iostream>

class Solution {
public:
	int rob(vector<int>& nums) {
		int size = nums.size();
				
		if (size == 0) {
			return 0;
		}
		
		int money[size] = {0};
		
		money[0] = nums[0];
		
		for (int i = 1; i < size; i++) {
			
			int current = nums[i];
			
			if (i == 1) {
				
				money[i] = max(money[i - 1], current);
			} else {
				
				money[i] = max(money[i - 1], money[i - 2] + current);
			}
		}
		
		return money[size - 1];
	}	
};

int main(int argc, char *argv[]) {
	
}