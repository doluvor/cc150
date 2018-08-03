/// Unique Binary Search Tree

import java.util.*;

class P96 {
	public static void main(String[] args) {
				
		System.out.println(numTrees(17));
	}

	public static int numTrees(int n) {
		
		int[] nums = new int[n + 1];
		nums[0] = 1;
		nums[1] = 1;
		
		return subTrees(n, nums);
	}
	
	private static int subTrees(int n, int[] nums) {
		
		if (nums[n] > 0) {
			return nums[n];
		}
		
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			result += subTrees(i, nums) * subTrees(n - i - 1, nums);
		}
		
		nums[n] = result;
		
		return result;
	}
}
