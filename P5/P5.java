// Longest Palindromic Substring

class P5 {
	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("cbbd"));
	}
	
	public static String longestPalindrome(String s) {
		
		int length = s.length();
		
		if (length <= 1) {
			return s;
		}
		
		int checks[][] = new int[length][length];
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				checks[i][j] = -1;
			}
		}
		
		String result = s.substring(0, 1);
		int maxlength = 1;
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
						
				if (check(i, j, s, checks) == 1 && j - i + 1 > maxlength) {
					maxlength = j - i + 1;
					result = s.substring(i, j + 1);
				}
			}
		}

		return result;
	}
	
	private static int check(int i, int j, String s, int checks[][]) {
		
		if (checks[i][j] != -1) {
			return checks[i][j];
		}
		
		if (i > j) {
			checks[i][j] = 0;
		} else if (i == j) {
			checks[i][j] = 1;
		} else if (i + 1 == j) {
			
			if (s.charAt(i) == s.charAt(j)) {
				checks[i][j] = 1;
			} else {
				checks[i][j] = 0;
			}
			
		} else {
			
			if (s.charAt(i) != s.charAt(j)) {
				checks[i][j] = 0;
			} else {
				checks[i][j] = check(i + 1, j - 1, s, checks);
			}
		}
		
		return checks[i][j];	
	}
}
