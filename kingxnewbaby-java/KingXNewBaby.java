// SRM 537 DIV 2 - 250 points
public class KingXNewBaby {

	public String isValid(String name) {
		return isValidName(name) ? "YES" : "NO";
	}

	private boolean isValidName(String name) {		
		if (name.length() != 8) { // It must consist of exactly eight letters.
			return false;
		}
		char current = ' ';
		int numOfVowel = 0;
		char firstVowel = ' ';
		for(int i = 0; i < name.length(); i++) {
			current = name.charAt(i);
			if(current < 'a' || current > 'z') { // All letters must be lowercase ('a'-'z').
				return false;
			}
			if(current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
				numOfVowel++;
				if(numOfVowel == 1) {
					firstVowel = current;
				}
				else if(numOfVowel == 2 && current != firstVowel) { // The two vowels must be equal.
					return false;
				}
			}
		}
		if(numOfVowel != 2) {
			return false;
		}
		return true;
	}
}
