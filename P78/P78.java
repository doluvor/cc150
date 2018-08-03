// Subsets

import java.util.List;
import java.util.ArrayList;

class P78 {
	public static void main(String[] args) {
		
		int nums[] = {0, 1, 2, 3};

		List<List<Integer>> results = subsets(nums);
				
		for (List<Integer> list : results) {
			System.out.println(list);
		}
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> results = new ArrayList<>();
		
		results.add(new ArrayList<>());
				
		if (nums.length == 0) {
			return results;
		}
		
		backtrack(results, new ArrayList<>(), nums);

		return results;
	}
	
	private static void backtrack(List<List<Integer>> lists, List<Integer> list, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(i)) {
				continue;
			}
			if (list.size() > 0 && list.get(list.size() - 1) > i) {
				continue;
			}
			
			list.add(i);
			
			List<Integer> resultList = new ArrayList<>();
								
			for (Integer index : list) {
				resultList.add(nums[index]);
			}
						
			lists.add(resultList);
			backtrack(lists, list, nums);
			list.remove(list.size() - 1);
		}
	}
}