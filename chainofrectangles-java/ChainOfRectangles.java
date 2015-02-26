import java.util.HashMap;
import java.util.Map;

// SRM 369 DIV 2 - 250 points
public class ChainOfRectangles {

	public int getMaximalArea(int[] width, int[] height, String color) {
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		int max = 0;
		int currentTotalArea = 0;
		int currentNetArea = 0;
		int lastTotalArea = 0;
		for (int i = width.length - 1; i >= 0; i--) {
			currentTotalArea = width[i] * height[i];
			currentNetArea = currentTotalArea - lastTotalArea;
			lastTotalArea = currentTotalArea;
			char key = color.charAt(i);
			int value = (countMap.get(key) == null) ? 0 : countMap.get(key);
			value += currentNetArea;
			if (max < value) {
				max = value;
			}
			countMap.put(key, value);
		}
		return max;
	}

}
