class P26 {
	public static void main(String[] args) {
		
		int[] input = {1, 2, 2, 3, 3, 4, 5};
		
		int length = removeDuplicates(input);
		
		for (int i = 0; i < length; i++) {
			System.out.println(input[i]);
		}
	}
	
	public static int removeDuplicates(int[] nums) {
		
		int length = 0;
		
		if (nums.length > 0) {
			length = 1;
		}
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i+1]) {
				length++;
				nums[length - 1] = nums[i+1];
			}
		}
		
		return length;
	}
}
