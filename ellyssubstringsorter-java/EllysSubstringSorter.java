import java.util.Arrays;

// SRM 606 DIV 2 - 250 points

public class EllysSubstringSorter {

	public String getMin(String S, int L) {
		String min = runElly(S, L, 0);
		String current = "";
		for (int i = 1; i < (S.length() - L); i++) {
			current = runElly(S, L, i);
			if (isSmaller(min, current)) {
				min = current;
			}
		}
		return min;
	}

	private boolean isSmaller(String min, String current) {
		int i = 0;
		while (i < min.length() && min.charAt(i) == current.charAt(i)) {
			i++;
		}
		if (i < min.length() && min.charAt(i) > current.charAt(i)) {
			return true;
		}
		return false;
	}

	private String runElly(String S, int L, int index) {
		String original = S.substring(index, index + L);
		char[] chars = original.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		String result = S.substring(0, index) + sorted + S.substring(index + L, S.length());
		return result;
	}

}