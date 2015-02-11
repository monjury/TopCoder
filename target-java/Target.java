public class Target {

	private char[][] matrix;

	public String[] draw(int n) {
		matrix = new char[n][n];
		String[] result = new String[n];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				fillContent(row, col, ' ');
				if (col % 2 == 0) { // Selected Column
					int offset = col;
					int startBoundary = 0 + offset;
					int endBoundary = (n-1) - offset;
					if(row >= startBoundary && row <= endBoundary) {
						fillContent(row, col, '#');
					}
				} 
				if (row % 2 == 0) { // Selected Row
					int offset = (n-1) - row;
					int startBoundary = 0 + offset;
					int endBoundary = (n-1) - offset;
					if(col >= startBoundary && col <= endBoundary) {
						fillContent(row, col, '#');
					}
				} 
			}
			
		}
		
		for (int row = 0; row < n; row++) {
			String currentRow = "";
			for (int col = 0; col < n; col++) {
				currentRow += String.valueOf(matrix[row][col]);
			}
			result[row] = currentRow;
			System.out.println(result[row]);
		}
		
		return result;
	}

	private void fillContent(int row, int col, char content) {
		matrix[row][col] = content;
		matrix[col][row] = content;
	}
}
