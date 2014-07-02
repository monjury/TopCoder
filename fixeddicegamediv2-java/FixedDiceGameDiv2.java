// SRM 626 DIV 2 - 500 points
public class FixedDiceGameDiv2 {

	public double getExpectation(int a, int b) {
		int numberOfGames = 0;
		int total = 0;
		for(int i = 2; i <= a; i++ ) {
			for(int j = 1; j <= b; j++ ) {
				if(i > j) {
					numberOfGames++;
					total += i;
				}
			}
		}
		return (total /  (double)numberOfGames);
	}
}
