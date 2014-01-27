// SRM 195 DIV 2 - 250 points

public class Rounder {

	public int round(int n, int b) {
		double distanceFromLowerBound  = n % b;
		if(distanceFromLowerBound < ((double)b/2)) {
			n -= distanceFromLowerBound;
		}
		else {
			n += (b - distanceFromLowerBound);
		}
		return n;
	}

}
