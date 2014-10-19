import java.util.Arrays;
import java.util.List;

//SRM 240 DIV 2 - 250 points
public class Pronunciation {

	private static final List<Character> VOWELS = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
	
	public String canPronounce(String[] words) {
		if(words != null && words.length > 0) {
			for(String word : words) {
				if(word != null && word.length() > 1) {
					for(int i = 0; i < word.length()-2; i++) {
						if(!VOWELS.contains(word.charAt(i)) 
								&& !VOWELS.contains(word.charAt(i+1)) 
								&& !VOWELS.contains(word.charAt(i+2))) {
							return word;
						}
						if(VOWELS.contains(word.charAt(i)) 
								&& VOWELS.contains(word.charAt(i+1)) 
								&& (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(i+1)))) {
							return word;
						}
					}
					
					char first = Character.toLowerCase(word.charAt(word.length() - 2));
					char second = Character.toLowerCase(word.charAt(word.length() - 1));
					if(VOWELS.contains(first) && VOWELS.contains(second)  && first != second) {
						return word;
					}
				}
			}
		}
		return "";
	}
}
