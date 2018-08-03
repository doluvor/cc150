class P88 {
	public static void main(String[] args) {
		
		int[] input1 = {1, 2, 3, 4, 0, 0, 0};
		int[] input2 = {1, 2, 3};
		
		merge(input1, 4, input2, 3);
		
		for (int i = 0; i < input1.length; i++) {
			System.out.println(input1[i]);
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int i1 = m - 1;
		int i2 = n - 1;
		
		int length = m + n;
		
		for (int i = length - 1; i >= 0; i--) {
			
			if (i1 < 0) {
				nums1[i] = nums2[i2];
				i2--;
			} else if (i2 < 0) {
				nums1[i] = nums1[i1];
				i1--;
			} else if (nums1[i1] >= nums2[i2]) {
				nums1[i] = nums1[i1];
				i1--;
			} else {
				nums1[i] = nums2[i2];
				i2--;
			}
		}
	}
}