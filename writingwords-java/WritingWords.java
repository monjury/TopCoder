public class WritingWords {

	public int write(String word) {
		int total = 0;
		for(int i = 0; i < word.length(); i++) {
			total += ((int) word.charAt(i) - 64);
		}
		return total;
	}

}
