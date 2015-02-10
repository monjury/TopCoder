// SRM 441 Div 2 250 points
public class DifferentStrings {

	public int minimize(String A, String B) {
		if (A.length() < B.length()) {
			int minDiff = A.length();
			int lengthDiff = B.length() - A.length();
			for (int i = 0; i <= lengthDiff; i++) {
				String comparable = B.substring(i, i + A.length());
				int diff = difference(A, comparable);
				if (diff < minDiff) {
					minDiff = diff;
				}
			}
			return minDiff;
		}
		return difference(A, B);
	}

	private int difference(String A, String B) {
		int difference = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				difference++;
			}
		}
		return difference;
	}
}
