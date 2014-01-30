// SRM 606 DIV 2 - 500 points

public class EllysNumberGuessing {

	public int getNumber(int[] guesses, int[] answers) {
		int upper = guesses[0] + answers[0];
		int lower = guesses[0] - answers[0];
		
		boolean isUpper = true;
		boolean isLower = true;
		
		int currentUpper = 0;
		int currentLower = 0;
		
		if(lower < 1) {
			isLower = false;
		}
		
		if(upper > 999999999) {
			isUpper = false;
		}
		
		for(int i = 1; i < guesses.length; i++) {
			currentUpper = guesses[i] + answers[i];
			currentLower = guesses[i] - answers[i];
			
			if ((currentUpper == upper && currentLower != lower)
					|| (currentLower == upper && currentUpper != lower)) {
				isLower = false;
			}
			else if((currentUpper != upper && currentLower == lower)
					|| (currentLower != upper && currentUpper == lower)) {
				isUpper = false;
			}			
		}
		if(!isUpper && isLower) {
			return lower;
		}
		if(!isLower && isUpper) {
			return upper;
		}
		if(!isLower && !isUpper) {
			return -2;
		}
		return -1;
	}
}