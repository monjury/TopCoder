
public class FuelConsumption {

	// SRM 217 DIV 2 - 250 points
	public double maximalDistance(int[] velocities, int[] consumptions, int fuel) {		
		double maxDistance = 0;
		double currentDistance = 0;
		for(int i = 0; i < velocities.length; i++) {
			currentDistance = ((double) velocities[i] / consumptions[i]) * fuel;
			if(currentDistance > maxDistance) {
				maxDistance = currentDistance;
			}
		}
		return maxDistance;
	}
}
