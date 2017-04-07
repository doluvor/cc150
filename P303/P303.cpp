#include <iostream>
#include <vector>

using namespace std;

class NumArray {
public:
	NumArray(vector<int> nums) {
		
		int size = nums.size();
		
		m_sums = new int[size];
					
		for (int i = 0; i < size; i++) {
			
			int current = nums[i];
			
			if (i == 0) {
				m_sums[i] = current;
			} else {
				m_sums[i] = current + m_sums[i - 1];	
			}			
		}
	}
	
	int sumRange(int i, int j) {
		
		if (i == 0) {
			return m_sums[j];
		} else {
			return m_sums[j] - m_sums[i - 1];	
		}		
	}
	
private:
	int* m_sums;
};

int main(int argc, char *argv[]) {
	
}