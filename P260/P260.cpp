ass Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        
        int r = 0;
        
        for (int i = 0; i < nums.size(); i++) {
            r ^= nums[i];
        }
        
        int last = r & ~(r - 1);
        
        int a = 0;
        int b = 0;
        
        for (int i = 0; i < nums.size(); i++) {
            
            if ((last & nums[i]) == 0) {
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }
        
        vector<int> result;
        result.push_back(a);
        result.push_back(b);
        
        return result;
    }
};
