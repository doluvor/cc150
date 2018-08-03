class P35 {
	public static void main(String[] args) {
		
		int[] input = {1, 2, 3, 4};
		
		int result = searchInsert(input, 4);
		System.out.println(result);
	}

	public static int searchInsert(int[] nums, int target) {
				
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == target || nums[i] > target) {
				return i;
			}
		}
		
		return nums.length;
	}
}
