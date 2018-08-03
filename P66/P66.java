class P66 {
	public static void main(String[] args) {
		int[] input = {9, 9, 1};
		int[] result = plusOne(input);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] plusOne(int[] digits) {
		
		int length = digits.length;
		
		int index = length - 1;
		
		while (index >= 0) {
			int result = digits[index] + 1;
			
			if (result < 10) {
				digits[index] = result;
				return digits;
			} else {
				digits[index] = 0;
			}
			
			if (index == 0) {
				int[] newDigits = new int[length + 1];
				newDigits[0] = 1;
				
				for (int i = 1; i < length + 1; i++) {
					newDigits[i] = digits[i - 1];
				}
				
				return newDigits;
			}
			
			index--;
		}
		
		return null;
	}
}
