/// Reverse Integer

import java.util.*;

class P7 {
	public static void main(String[] args) {
				
		System.out.println(reverse(1534236469));
	}

	public static int reverse(int x) {
		
		Boolean isNegetive = false;
		
		if (x < 0) {
			x = -x;
			isNegetive = true;
		}
		
		Queue<Integer> nums = new LinkedList<>();
		
		while (x > 0) {
			nums.add(x % 10);
			x = x / 10;
		}
		
		int result = 0;
		
		while (nums.size() != 0) {
			
			int num = nums.remove();
			
			if (result != 0 || num != 0) {
				
				int newResult = result * 10 + num;
				
				if (result != 0 && newResult / result < 10) {
					return 0;
				}
				
				result = newResult;
			}
		}
		
		if (isNegetive) {
			result = - result;
		}
		
		return result;
	}
}
