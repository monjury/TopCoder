public class DistanceBetweenStrings {

	// SRM 350 DIV 2 - 250 points
	
	public int getDistance(String a, String b, String letterSet) {
		int length = letterSet.length();
		int[] firstOccurences = new int[length];
		int[] secondOccurences = new int[length];
		int difference = 0;
		for(int i = 0; i < letterSet.length(); i++) {
			for(int j = 0; j < a.length(); j++) {
				if(letterSet.charAt(i) == a.charAt(j)) {
					firstOccurences[i] ++;
				}
			}
			for(int k = 0; k < b.length(); k++) {
				if(letterSet.charAt(i) == b.charAt(k)) {
					secondOccurences[i] ++;
				}
			}
			difference += Math.pow(Math.abs(firstOccurences[i] - secondOccurences[i]), 2);
		}
		return difference;
	}
}