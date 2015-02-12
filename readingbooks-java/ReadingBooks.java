import java.util.HashMap;
import java.util.Map;

//srm 404 div 2 250 points
public class ReadingBooks {

	public int countBooks(String[] readParts) {
		int count = 0;
		String[] threeParts = new String[3];
		for (int i = 0; i <= readParts.length - 3; i++) {
			threeParts[0] = readParts[i];
			threeParts[1] = readParts[i + 1];
			threeParts[2] = readParts[i + 2];
			if(isEntire(threeParts)) {
				count++;
				i+= 2;
			}
		}
		return count;
	}
	
	private boolean isEntire(String[] threeParts) {
		Map<String, Integer> part = new HashMap<String, Integer>();
		for (String readPart : threeParts) {
			int value = (part.get(readPart) == null) ? 0 : part.get(readPart);
			value++;
			part.put(readPart, value);
			if(value > 1) {
				return false;
			}
		}
		return true;
	}
}
