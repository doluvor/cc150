// Perfect Squares

class P279 {
	public static void main(String[] args) {
								
		System.out.println(numSquares(13));	
	}
	
	public static int numSquares(int n) {
		
		int[] nums = new int[n + 1];

		return subSquares(n, nums);
	}
	
	private static int subSquares(int n, int[] nums) {
		
		if (nums[n] > 0) {
			return nums[n];
		}
		
		int i = 1;
		
		while (i * i <= n) {
			i++;
		}
		
		for (int j = i - 1; j >= 1; j--) {
			int subNum = subSquares(n - j * j, nums);
			if (nums[n] == 0 || nums[n] > subNum + 1) {
				nums[n] = subNum + 1;
			}
		}
		
		return nums[n];
	}
}
