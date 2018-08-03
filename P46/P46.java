// Permutations

import java.util.List;
import java.util.ArrayList;

class P46 {
	public static void main(String[] args) {
		
//		int nums[] = {1, 1};
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(3);

		List<List<Integer>> results = permute(nums);
				
		for (List<Integer> list : results) {
			System.out.println(list);
		}
	}
	
	public static List<List<Integer>> permute(List<Integer> nums) {
		
		List<List<Integer>> results = new ArrayList<>();
		
		if (nums.size() == 0) {
			return results;
		}
		
		backtrack(results, new ArrayList<>(), nums, nums.size());

		return results;
	}
	
	private static void backtrack(List<List<Integer>> lists, List<Integer> list, List<Integer> nums, Integer count) {
		if (list.size() == count) {
			
			List valueList = new ArrayList<>();
			
			
			lists.add(new ArrayList(list));
//			System.out.println(list);
		} else {
			for (int i = 0; i < nums.size(); i++) {
//				if (list.contains(i)) {
//					continue;
//				}
				if (list.isEmpty() && nums.get(i) == 0) {
					continue;
				}
				list.add(nums.get(i));
				List<Integer> newNums = new ArrayList(nums);
				newNums.remove(i);
				backtrack(lists, list, newNums, count);
				list.remove(list.size() - 1);
			}
		}
	}
}