import java.util.ArrayList;
import java.util.List;

//SRM 152 DIV 2 - 500 points
public class LeaguePicks {

	public int[] returnPicks(int position, int friends, int picks) {
		List<Integer> result = new ArrayList<>();
		int i = 0;
		while (true) {
			int first = (friends * i) + position;
			i+=2;
			int second = (friends * i) - (position - 1);
			if (first > picks) {
				break;
			}
			result.add(first);
			if (second > picks) {
				break;
			}
			result.add(second);
		}
		int[] intArray = new int[result.size()];
		for (int j = 0; j < intArray.length; j++) {
		    intArray[j] = result.get(j);
		}
		return intArray;
	}
}