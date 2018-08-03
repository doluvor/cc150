class P67 {
	public static void main(String[] args) {
		String result = addBinary("101", "11");
		System.out.println(result);
	}
	
	public static String addBinary(String a, String b) {
		
		int lengthA = a.length();
		int lengthB = b.length();
		
		int intent = 0;
		
		int i = lengthA - 1;
		int j = lengthB - 1;
		
		StringBuffer result = new StringBuffer();
		
		while (i >= 0 && j >= 0) {
			char ca = a.charAt(i);
			char cb = b.charAt(j);
			
			int ia = ca - '0';
			int ib = cb - '0';
			
			int iresult = ia + ib + intent;
			
			intent = iresult / 2;
			iresult = iresult % 2;
			
			result.insert(0, iresult);
			
			i--;
			j--;
		}
		
		while (i >= 0) {
			char ca = a.charAt(i);
			int ia = ca - '0';
			int iresult = ia + intent;
			
			intent = iresult / 2;
			iresult = iresult % 2;
			
			result.insert(0, iresult);
			
			i--;
		}
		
		while (j >= 0) {
			char cb = b.charAt(j);
			int ib = cb - '0';
			int iresult = ib + intent;
			
			intent = iresult / 2;
			iresult = iresult % 2;
			
			result.insert(0, iresult);
			
			j--;
		}
		
		if (intent > 0) {
			result.insert(0, intent);
		}
		
		return result.toString();
	}
}