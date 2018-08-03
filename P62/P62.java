/// Unique Paths

class P62 {
	public static void main(String[] args) {
		
		System.out.println(uniquePaths(51, 9));
	}
	
	public static int uniquePaths(int m, int n) {
		
		int[][] paths = new int[m + 1][n + 1];
		
		return subPaths(m, n, paths);		
	}
	
	private static int subPaths(int m, int n, int[][] paths) {
		
		if (m < 1 && n < 1) {
			return 0;
		}
		
		if (m == 1 || n == 1) {
			return 1;
		}
		
		if (paths[m][n] > 0) {
			return paths[m][n];
		}
		
		int path = subPaths(m - 1, n, paths) + subPaths(m, n - 1, paths);
		paths[m][n] = path;
		
		return path;
	}
}