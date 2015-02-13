import java.util.HashMap;
import java.util.Map;

// SRM 463 DIV 2 - 250 
public class BunnyPuzzle {
	Map<Integer,Integer> positionMap = new HashMap<Integer,Integer>();
	public int theCount(int[] bunnies) {
		int count = 0;
		for(int i = 0; i < bunnies.length; i++) {
			positionMap.put(bunnies[i], i);
		}
		for(int i = 0; i < bunnies.length; i++) {
			if(i > 0 && canJump(bunnies[i], bunnies[i-1])) { // Left Jump
				count++;
			}
			if(i < bunnies.length - 1 && canJump(bunnies[i],  bunnies[i+1])) { // Right Jump
				count++;
			}
		}
		return count;
	}

	private boolean canJump(int a, int b) {
		int landingOffset = 2 * (Math.abs(b - a));
		int landing = (a < b) ? (a + landingOffset) : (a - landingOffset);
		if(positionMap.get(landing) != null) {
			return false; // Destination is not empty
		}
		int bunniesInBetween = 0;
		int start = (a < b) ? a + 1 : landing + 1;
		int end =  (a < b) ? landing - 1 : a - 1;
		for(int i = start; i <= end; i++) {
			if(positionMap.get(i) != null) {
				bunniesInBetween++;
			}
		}
		if(bunniesInBetween > 1) {
			return false;
		}
		return true;
	}
}
