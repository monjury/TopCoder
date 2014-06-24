import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CandidatesSelectionEasy {

	public int[] sort(String[] score, int x) {
		Map<Character, List<Integer>> occurance = new HashMap<Character, List<Integer>>();
		for (int i = 0; i < score.length; i++) {
			Character key = score[i].charAt(x);
			List<Integer> occuranceIndexList = occurance.get(key);
			if (occuranceIndexList == null) {
				occuranceIndexList = new ArrayList<Integer>();
			}
			occuranceIndexList.add(i);
			occurance.put(key, occuranceIndexList);
		}
		int[] sortedValue = new int[score.length];
		int i = 0;
		for (Character bestSkill = 'A'; bestSkill <= 'Z'; bestSkill++) {
			List<Integer> occuranceIndexList = occurance.get(bestSkill);
			if (occuranceIndexList != null) {
				for (int j = 0; j < occuranceIndexList.size(); j++) {
					sortedValue[i] = occuranceIndexList.get(j);
					System.out.print(sortedValue[i]);
					i++;
				}
			}
		}
		System.out.println("\n");
		return sortedValue;
	}
}
