#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
	int numTrees(int n) {
		
		if (n == 0) {
			return 1;
		}
		
		nums = vector<int>(n, 0);
		
		for (int i = 0; i < n; i++) {
			nums[i] = 0;
		}
						
		return subNum(n);
	}
	
	int subNum(int length) {
		
		if (nums[length - 1] > 0) {
						
			return nums[length - 1];
		}
		
		int num = 0;
		
		for (int i = 0; i < length; i++) {
			num += max(subNum(i), 1) * max(subNum(length - i - 1), 1);
		}
		
		nums[length - 1] = num;
		
		return num;
	}
	
private:
	vector<int> nums;
};

int main(int argc, char *argv[]) {
	
	Solution solution = Solution();
	
	cout << solution.numTrees(10) << endl;
	
	return 0;
}
