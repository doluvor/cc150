// Longest Increasing Subsequence

class P300 {
	public static void main(String[] args) {

		int nums[] = {1,3,6,7,9,4,10,5,6};

		System.out.println(lengthLIS(nums));
	}

	public static int lengthLIS(int[] nums) {

		int length = nums.length;
		
		if (length == 0) {
			return 0;
		}
		
		if (length == 1) {
			return 1;
		}

		int[] counts = new int[length];

		counts[0] = 1;
		
		int result = 0;
		
		for (int i = 1; i < length; i++) {
			
			int count = 1;
			
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					count = Math.max(counts[j] + 1, count);
				}
 			}

			counts[i] = count;
			
			result = Math.max(result, count);
		}
		
		return result;
	}
}
