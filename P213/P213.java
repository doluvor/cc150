class P213 {
	public static void main(String[] args) {
			
		int nums[] = {1,1,3,6,7,10,7,1,8,5,9,1,4,4,3};
				
		System.out.println(rob(nums));		
	}

	public static int rob(int[] nums) {
		
		int length = nums.length;
		
		if (length == 0) {
			return 0;
		}
		
		if (length == 1) {
			return nums[0];
		}
		
		if (length == 2) {
			return Math.max(nums[0], nums[1]);
		}
		
		int[] results1 = new int[length];
		int[] results2 = new int[length];
		
		results1[0] = nums[0];
		results1[1] = Math.max(nums[0], nums[1]);
		results2[1] = nums[1];
		
		for (int i = 2; i < length; i++) {
			
			if (i == length - 1) {			
				results1[i] = results1[i - 1];				
				results2[i] = Math.max(results2[i - 1], results2[i - 2] + nums[i]);			
			} else {
				results1[i] = Math.max(results1[i - 1], results1[i - 2] + nums[i]);			
				results2[i] = Math.max(results2[i - 1], results2[i - 2] + nums[i]);			
			}		
		}
		
		return Math.max(results1[length - 1], results2[length - 1]);
	}
}