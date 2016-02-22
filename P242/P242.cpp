ass Solution {
public:
    bool isAnagram(string s, string t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        int chars[256] = {0};
        
        for (int i = 0; i < s.length(); i++) {
            
            chars[s[i]]++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            
            if (chars[t[i]] == 0) {
                return false;
            } else {
                chars[t[i]]--;
            }
        }
        
        return true;
    }
};
