import java.util.HashSet;
import java.util.Set;

public class StringTrain {

	public String buildTrain(String[] cars) {
		if(cars == null || cars.length < 1) {
			return null;
		}
		StringBuilder train = new StringBuilder(cars[0]);		
		StringBuilder matchingSubstring = null;
		for(int i = 1; i < cars.length; i++) {
			matchingSubstring = new StringBuilder(getMatchingPrefix(cars[i], train.toString()));
			train.append(matchingSubstring);
		}
		int totalStringLength = train.length();
		String output = removeAllButLastOccurance(train);
		return totalStringLength + " " + output;
	}

	private String getMatchingPrefix(String car, String train) {
		boolean isFound = false;
		String carPrefix = "";
		String trainSuffix = "";
		String output = "";
		int trainLastIndex = train.length();
		int maxPossibleLengthOfSubString = (car.length() > train.length()) ? (train.length() - 1) : (car.length() - 1);
		for(int i = 1; i <= maxPossibleLengthOfSubString; i++) {
			carPrefix = car.substring(0, i);
			trainSuffix = train.substring(trainLastIndex - i, trainLastIndex);
			if(carPrefix.equals(trainSuffix)) {
				isFound = true;
				output = car.substring(i, car.length());
			}
		}
		if(isFound) {
			return output;
		}
		return "";
	}
	
	private String removeAllButLastOccurance(StringBuilder input) {
		Set<Character> characterSet = new HashSet<Character>();
		for(int i = input.length() - 1; i >= 0 ; i--) {
			char currentCharacter = input.charAt(i);
			if(characterSet.contains(currentCharacter)) {
				input.deleteCharAt(i);
			}
			characterSet.add(currentCharacter);
		}
		return input.toString();
	}
}
