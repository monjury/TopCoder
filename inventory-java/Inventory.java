// SRM 153 DIV 2 - 500 points

public class Inventory {

	public int monthlyOrder(int[] sales, int[] daysAvailable) {
		double average = 0;
		int totalMonth = 0;
		for (int i = 0; i < sales.length; i++) {
			if (daysAvailable[i] != 0) {
				totalMonth++;
				average += sales[i] * (30 / (double) daysAvailable[i]);
				average = (double)Math.round(average * 100000) / 100000;
			}
		}
		return (int) Math.ceil((average / totalMonth));
	}
}