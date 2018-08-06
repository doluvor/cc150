// Word Break
import java.util.*;

class P139 {
	public static void main(String[] args) {
		
		List<String> wordDict = new ArrayList();
		wordDict.add("apple");
		wordDict.add("pen");
		
		System.out.println(wordBreak("applepenapple", wordDict));
	}
	
	public static boolean wordBreak(String s, List<String> wordDict) {
		
		Map<String, Boolean> map = new HashMap();

		return subWordBreak(s, wordDict, map);
	}
	
	private static boolean subWordBreak(String s, List<String> wordDict, Map<String, Boolean> map) {
		
		if (map.get(s) != null) {
			return map.get(s);
		}
		
		int length = s.length();
		
		
		if (length == 0) {
			return false;
		}
		
		if (wordDict.contains(s)) {
			map.put(s, true);
			return true;
		}
		
		for (int i = 1; i < length; i++) {
			String part1 = s.substring(0, i);
			String part2 = s.substring(i, length);
			
			if (subWordBreak(part1, wordDict, map) && subWordBreak(part2, wordDict, map)) {
				map.put(s, true);
				return true;
			} 
		}
		
		map.put(s, false);
		return false;
	}
}