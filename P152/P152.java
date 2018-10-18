/// Maximum Product Subarray

class P152 {
	public static void main(String[] args) {
		
		int inputs[] = {3, 0, 2, 1, 0, 1};
		
		System.out.println(maxProduct(inputs));
	}
	
	public static int maxProduct(int[] nums) {
		
		int length = nums.length;
		
		if (length == 0) {
			return 0;
		}
		
		int result = nums[0];
		
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 1; i < length; i++) {
			
			if (nums[i] < 0) {
				int temp = max;
				max = min;
				min = temp;
			}
			
			max = Math.max(max * nums[i], nums[i]);
			min = Math.min(min * nums[i], nums[i]);
			
			result = Math.max(max, result);
		}
		
		return result;
	}
}
