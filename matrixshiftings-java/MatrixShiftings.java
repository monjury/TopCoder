public class MatrixShiftings {

	public int minimumShifts(String[] matrix, int value) {
		boolean isFound = false;
		int xLength = matrix[0].length();
		int minXShift =  xLength / 2;
		int minYShift =  matrix.length / 2;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length(); j++) {
				if(Integer.parseInt(matrix[i].substring(j, j+1)) == value) {
					isFound = true;
					minXShift = getMinShift(j, xLength, minXShift);
					minYShift = getMinShift(i, matrix.length, minYShift);
				}
			}
		}
		return (isFound) ? (minXShift + minYShift) : -1;
	}

	private int getMinShift(int currentPosition, int totalLength, int minShift) {
		int midPoint = totalLength / 2;
		int moves = (currentPosition < midPoint) ? currentPosition : (totalLength - currentPosition);
		if(moves < minShift) {
			minShift = moves;
		}
		return minShift;
	}
}
