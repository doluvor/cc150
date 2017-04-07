#include <iostream>

class Solution {
public:
	int maxSubArray(vector<int>& nums) {
				
		const int size = nums.size();
				
		if (size == 0) {
			return 0;
		}
		
		if (size < 2) {
			return nums[0];
		}
		
		int start[size] = {0};
		int sub[size] = {0};
		
		start[0] = nums[0];
		sub[0] = nums[0];
		
		for (int i = 1; i < size; i++) {
		
			int current = nums[i];
		
			start[i] = max(start[i-1] + current, current);
			sub[i] = max(sub[i-1], start[i]);
		}
		
		return sub[size - 1];
	}	
};

using namespace std;
int main(int argc, char *argv[]) {
	
}