// SRM 144 DIV 2 - 550 points
// Failed

public class BinaryCode {

	public String[] decode(String message) {
		StringBuilder first = singleDecode(message, true);
		StringBuilder second = singleDecode(message, false);
		
		String[] result = new String[2];
		result[0] = first.toString();
		result[1] = second.toString();
		return result;
	}

	private StringBuilder singleDecode(String message, boolean startWithZero) {
		StringBuilder currentString = new StringBuilder();
		int current = startWithZero ? 0 : 1;
		currentString.append(current);
		int last = current;
		int secondLast = current;

		
		// Second Character
		current =  Integer.parseInt(message.charAt(0) + "") - last;
		if(current < 0 || current > 1) {
			return new StringBuilder("NONE");
		}
		else {
			currentString.append(current);
		}
		secondLast = last;
		last = current;
		
		// Other 
		for(int i = 2; i < message.length(); i++) {
			current = Integer.parseInt(message.charAt(i-1) + "") - last - secondLast;
			if(current < 0 || current > 1) {
				return new StringBuilder("NONE");
			}
			else {
				currentString.append(current);
			}
			secondLast = last;
			last = current;
		}
		
		if(current != (Integer.parseInt(message.charAt(message.length()-1) + "") - secondLast)) {
			return new StringBuilder("NONE");
		}
		
		return currentString;
	}
}
