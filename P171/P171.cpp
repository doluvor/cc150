ass Solution {
public:
    int titleToNumber(string s) {
        
        int length = s.length();
        
        int result = 0;
        
        for (int i = 0; i < length; i++) {
            
            result += (s[length - i - 1] - 'A' + 1) * pow(26, i);
        }
        
        return result;
    }
};
