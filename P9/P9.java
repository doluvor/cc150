class P9 {
	public static void main(String[] args) {
		boolean result = isPalindrome(10101);
		System.out.println(result);
	}
	
	public static boolean isPalindrome(int x) {
		
		if (x < 0) {
			return false;
		}
		
		if (x < 10) {
			return true;
		}
		
		int reverse = x % 10;
		
		if (reverse == 0) {
			return false;
		}
		
		x = x / 10;
		
		while (true) {
			
			if (x == 0) {
				return false;
			}
			
			if (reverse == x || reverse / 10 == x) {
				return true;
			}
			
			if (reverse > x) {
				return false;
			}
			
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}
	}
}
