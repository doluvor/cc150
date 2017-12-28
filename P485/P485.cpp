#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
	int findMaxConsecutiveOnes(vector<int>& nums) {
		
		int max = 0;
		int consecutive = 0;
		
		for_each(nums.begin(), nums.end(), [&max, &consecutive](int num){
			
			if (num == 1) {
				consecutive++;
				
				if (max < consecutive) {
					max = consecutive;
				}
			} else {
				consecutive = 0;
			}
		});
		
		return max;
	}
};

int main(int argc, char *argv[]) {
	
	Solution solution = Solution();
	
	vector<int> nums = {1,1,0,1,1,1,0,0,1,1,1,1,0};
	
	cout << solution.findMaxConsecutiveOnes(nums) << endl;
	
	return 0;
}