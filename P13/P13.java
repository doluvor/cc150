import java.util.HashMap;

class P13 {
	public static void main(String[] args) {
			
		String input1 = "XII";
		int result1 = 12;
				
		if (romanToInt(input1) == result1) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		String input2 = "IIX";
		int result2 = 8;
				
		if (romanToInt(input2) == result2) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		String input3 = "MDCCCXCIX";
		int result3 = 1899;
				
		if (romanToInt(input3) == result3) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		
	}
	
	public static int romanToInt(String s) {
		
		int length = s.length();
		
		HashMap values = new HashMap<Character, Integer>();
		
		values.put('I', 1);
		values.put('V', 5);
		values.put('X', 10);
		values.put('L', 50);
		values.put('C', 100);
		values.put('D', 500);
		values.put('M', 1000);
		
		int addedValue = 0;
		int total = 0;
		int lastCharValue = 0;
		
		for (int i = 0; i < length; i++) {
			
			char currentChar = s.charAt(i);
			int currentCharValue = (int)values.get(currentChar);
			
			if (currentCharValue == lastCharValue || lastCharValue == 0) {
				addedValue += currentCharValue;
			} else if (currentCharValue < lastCharValue) {
				total += addedValue;
				addedValue = currentCharValue;
			} else {
				addedValue = -addedValue + currentCharValue;
			}
			
			lastCharValue = currentCharValue;
		}
		
		total += addedValue;
		
		return total;
	}
}