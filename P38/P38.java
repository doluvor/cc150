class P38 {
	public static void main(String[] args) {
		
		System.out.println(countAndSay(5));
	}
	
	public static String countAndSay(int n) {

		if (n == 1) {
			return "1";
		}
		
		String last = countAndSay(n - 1);

		int num = 0;
		char lastChar = ' ';
		
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < last.length(); i++) {
			
			char c = last.charAt(i);
			
			if (lastChar == ' ') {
				num = 1;
				lastChar = c;
			} else if (lastChar == c) {
				num++;
			} else {
				result.append(String.valueOf(num));
				result.append(lastChar);
				
				num = 1;
				lastChar = c;
			}
		}
		
		result.append(String.valueOf(num));
		result.append(lastChar);
				
		return result.toString();
	}
}
