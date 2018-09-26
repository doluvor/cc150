// 221. Maximal Square

class P221 {
	public static void main(String[] args) {

		char matrix[][] = {
			{'1','0','1'},
			{'1','1','1'},
			{'1','1','1'}
		};

		System.out.println(maximalSquare(matrix));
	}

	public static int maximalSquare(char[][] matrix) {
		
		int height = matrix.length;
		
		if (height == 0) {
			return 0;
		}
		
		int width = matrix[0].length;
		
		if (width == 0) {
			return 0;
		}
		
		int[][] results = new int[height][width];
		
		int result = 0;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				
				if (i == 0 || j == 0) {
					results[i][j] = matrix[i][j];										
				} else if (matrix[i][j] == '0') {
					results[i][j] = 48;
				} else {
					results[i][j] = Math.min(Math.min(results[i][j - 1], results[i - 1][j]), results[i - 1][j - 1]) + 1;
				}
				
				if (result < results[i][j]) {
					result = results[i][j];
				}
			}
		}
		
		return (result - 48) * (result - 48);
	}
}
