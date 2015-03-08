
// SRM 370 DIV 2 - 250 points

public class Containers {

	public int wastedSpace(int[] containers, int[] packages) {
		int totalSpace = 0;
		int totalPackage = 0;

		for(int container : containers) {
			totalSpace += container;
		}
		
		for(int pckge : packages) {
			totalPackage += pckge;
		}
		
		return totalSpace - totalPackage;
	}

}
