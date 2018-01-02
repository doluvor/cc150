import java.util.Arrays;
import java.util.HashMap;

class P1 {
	public static void main(String[] args) {
			
		int[] case1 = {1, 2, 3, 4};
		int target1 = 7;
		int[] result1 = {2, 3};
				
		if (Arrays.equals(twoSum(case1, target1), result1)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		int[] case2 = {3, 2, 4};
		int target2 = 6;
		int[] result2 = {1, 2};
		
		if (Arrays.equals(twoSum(case2, target2), result2)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		HashMap counter = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if (counter.containsKey(nums[i])) {
				return new int[] {Integer.parseInt(counter.get(nums[i]).toString()), i};
			} else {
				counter.put(target - nums[i], i);
			}
		}
				
		return new int[0];
	}
}