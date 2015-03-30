// SRM 621 DIV 2 - 250 points
public class TwoWaysSorting {

	public String sortingMethod(String[] stringList) {
		boolean lexico = true;
		boolean shorter = true;
		for(int i = 0; i < stringList.length - 1; i++) {
			if(stringList[i].compareTo(stringList[i+1]) > 0) {
				lexico = false;
			}
			if(stringList[i].length() > stringList[i+1].length()) {
				shorter = false;
			}
		}
		
		if(lexico && shorter) {
			return "both";
		}
		else if(lexico) {
			return "lexicographically";
		} 
		else if(shorter) {
			return "lengths";
		}
		return "none";
	}
}