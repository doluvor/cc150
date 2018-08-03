/// Unique Paths II

class P63 {
	public static void main(String[] args) {
		
		int obstacleGrid[][] = 
		{
			{0, 0, 0, 0},
			{0, 1, 0, 0},
			{0, 0, 0, 0},
		};
		
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		
		int m = obstacleGrid.length;
		
		if (m == 0) {
			return 0;
		}
		
		int n = obstacleGrid[0].length;
		
		if (n == 0) {
			return 0;
		}

		int[] pathRow = new int[n];

		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				
				if (obstacleGrid[i][j] == 1) {
					pathRow[j] = 0;
				} else {
					if (i == m - 1 && j == n - 1) {
						pathRow[j] = 1;
					} else if (i == m - 1) {
						pathRow[j] = pathRow[j + 1];
					} else if (j == n - 1) {

					} else {
						pathRow[j] += pathRow[j + 1];
					}
				}
			}
		}
		
		return pathRow[0];
	}
	
	// Passed
	public int uniquePathsWithObstaclesPassed(int[][] obstacleGrid) {
			
			int m = obstacleGrid.length;
			
			if (m == 0) {
				return 0;
			}
			
			int n = obstacleGrid[0].length;
			
			if (n == 0) {
				return 0;
			}

			int[][] paths = new int[m][n];
					
			for (int i = m - 1; i >= 0; i--) {
				for (int j = n - 1; j >= 0; j--) {
					
					if (obstacleGrid[i][j] == 1) {
						paths[i][j] = 0;
					} else {
						
						if (i == m - 1 && j == n - 1) {
							paths[i][j] = 1;
						} else if (i == m - 1) {
							paths[i][j] = paths[i][j + 1];
						} else if (j == n - 1) {
							paths[i][j] = paths[i + 1][j];
						} else {
							paths[i][j] = paths[i][j + 1] + paths[i + 1][j];
						}
					}
				}
			}
			
			return paths[0][0];
		}
}
