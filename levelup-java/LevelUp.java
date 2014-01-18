public class LevelUp {
	
	// SRM 170 DIV 2 - 250 points
	public int toNextLevel(int[] expNeeded, int received) {
		int i = 0;
		while(expNeeded[i] <= received) {
			i++;
		}
		return (expNeeded[i] - received);
	}
}
