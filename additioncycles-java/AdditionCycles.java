//SRM 326 DIV 2 - 250 points
public class AdditionCycles {
	public int cycleLength(int n) {
		int count = 0;
		int initialNumber = n;
		int finalNumber = 0;		
		do {
			int sum = (initialNumber / 10) + (initialNumber % 10);
			int secondSum = sum % 10;
			finalNumber = ((initialNumber % 10) * 10) + secondSum;
			initialNumber = finalNumber;
			count++;
		} while (n != finalNumber);
		return count;
	}
}