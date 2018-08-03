// Triangle

import java.util.*;

class P120 {
	public static void main(String[] args) {
		
		List<Integer> line1 = Arrays.asList(2);
		List<Integer> line2 = Arrays.asList(3, 4);
		List<Integer> line3 = Arrays.asList(6, 5, 7);
		List<Integer> line4 = Arrays.asList(4, 1, 8, 3);
		List<List<Integer>> triangle = Arrays.asList(line1, line2, line3, line4);
		int result = minimumTotal(triangle);
		
		System.out.println(result);
	}

	public static int minimumTotal(List<List<Integer>> triangle) {

		if (triangle == null || triangle.size() == 0) {
			return 0;
		}
		
		int size = triangle.get(triangle.size() - 1).size();
		
		int[] total = new int[size];
		int[] temp = new int[size];
		
		for (int i = triangle.size() - 1; i >= 0; i--) {
			for (int j = triangle.get(i).size() - 1; j >= 0; j--) {
				if (i == triangle.size() - 1) {
					temp[j] = triangle.get(i).get(j);
				} else {
					temp[j] = Math.min(total[j], total[j + 1]) + triangle.get(i).get(j);
				}
			}
			
			System.arraycopy(temp, 0, total, 0, size);
		}

		return total[0];
	}
}
