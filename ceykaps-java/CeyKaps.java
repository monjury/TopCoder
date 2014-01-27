public class CeyKaps {

	// SRM 148 DIV 2 - 600 points
	public String decipher(String typed, String[] switches) {
		 
		// 1. Initialize a StringBuilder with Upper Case English Alphabets
		StringBuilder keys = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		// 2. For each switches swap alphabets in stringbuilder
		for(String singleSwitch : switches) {
			char before = singleSwitch.charAt(0);
			char after = singleSwitch.charAt(2);
			
			int beforeIndex = keys.indexOf(String.valueOf(before));
			int afterIndex = keys.indexOf(String.valueOf(after));
			
			keys.setCharAt(beforeIndex, after);
			keys.setCharAt(afterIndex, before);
		}
		
		// 3. Create result from indexes of keys position
		StringBuilder result = new StringBuilder("");
		for(int i = 0; i < typed.length(); i++) {
			int index = typed.charAt(i) - 65;
			String original = keys.charAt(index) + "";
			result.append(original);
		}
		return result.toString();
	}
}
