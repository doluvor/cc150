#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
	int arrayPairSum(vector<int>& nums) {
		
		sort(nums.begin(), nums.end());
		
		size_t size = nums.size();
		
		int total = 0;
		
		for (size_t i = 0; i < size; i+=2) {
			
			total += nums[i];
		}
		
		return total;
	}
};

int main(int argc, char *argv[]) {
	
	Solution solution = Solution();
	
	vector<int> num = {1,4,3,2};
	
	cout << solution.arrayPairSum(num) << endl;
	
	return 0;
}
