//srm 487 div 2 250 points
public class BunnyExamAfter {

	public int getMaximum(String black, String gray, String white) {
		int points  = 0;
		for(int i = 0; i < black.length();i++) {
			if(black.charAt(i) != gray.charAt(i)) {
				points++;
			}
			if(black.charAt(i) != white.charAt(i)) {
				points++;
			}
			if(black.charAt(i) != white.charAt(i) && black.charAt(i) != gray.charAt(i) && gray.charAt(i) != white.charAt(i)) {
				points--;
			}
		}
		return points;
	}

}
