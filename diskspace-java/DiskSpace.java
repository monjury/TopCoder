public class DiskSpace {

	// SRM 156 DIV 2 - 250 points
	
	public int minDrives(int[] used, int[] total) {
		int totalSpaceNeeded = 0;
		for(int i = 0; i < used.length; i++) {
			totalSpaceNeeded += used[i];
		}
		int i = 0;
		while(totalSpaceNeeded > 0) {
			totalSpaceNeeded -= total[i];
			i++;
		}
		return i;
	}

}
