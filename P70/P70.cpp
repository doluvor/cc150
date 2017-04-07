#include <iostream>

class Solution {
public:
	int climbStairs(int n) {
		
		int ways[n] = {0};
				
		ways[0] = 1;

		for (int i = 1; i < n; i++) {
			
			if (i == 1) {
				
				ways[i] = ways[i - 1] + 1;
					
			} else {
			
				ways[i] = ways[i - 1] + ways[i - 2];
			}
		}
		
		return ways[n - 1];
	}	
};

using namespace std;
int main(int argc, char *argv[]) {
	
}