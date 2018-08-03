class P27 {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		int[] input = {3, 2, 2, 3};
		
		int length = removeElement(input, 3);
		
		System.out.println(length);	
	}
	
	public static int removeElement(int[] nums, int val) {
	
		int length = 0;
	
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] != val) {
				nums[length] = nums[i];
				length++;
			}
		}
		
		return length;
	}
}