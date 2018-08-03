/// Minimum Path Sum

class P64 {
	public static void main(String[] args) {
		
		int grid[][] = 
		{
			{0, 1, 1, 0},
			{0, 1, 1, 0},
			{0, 1, 0, 1},
		};
		
		System.out.println(minPathSum(grid));
	}

	public static int minPathSum(int[][] grid) {

		int column = grid.length;
		
		if (column == 0) {
			return 0;
		}
		
		int row = grid[0].length;
		
		if (row == 0) {
			return 0;
		}
		
		int[] sums = new int[row];
		
		for (int i = column - 1; i >= 0; i--) {
			for (int j = row - 1; j >= 0; j--) {
				if (i == column - 1 && j == row - 1) {
					sums[j] = grid[i][j];
				} else if (i == column - 1) {
					sums[j] = sums[j + 1] + grid[i][j];
				} else if (j == row - 1) {
					sums[j] = sums[j] + grid[i][j];
				} else {
					sums[j] = Math.min(sums[j], sums[j + 1]) + grid[i][j];
				}
			}
		}

		return sums[0];
	}
}
