public class TireRotation {

	// SRM 158 DIV 2 - 250 points 
	
	public int getCycle(String initial, String current) {
		String[] phases = new String[4];
		phases[0] = initial;
		phases[1] = rotate(phases[0]);
		phases[2] = rotate(phases[1]);
		phases[3] = rotate(phases[2]);	
		for(int i = 0; i < phases.length; i++) {
			if(phases[i].equals(current)) {
				return i+1;
			}
		}
		return -1;
	}
	
	private String rotate(String initial) {
		StringBuilder result = new StringBuilder();
		result.append(initial.charAt(3));
		result.append(initial.charAt(2));
		result.append(initial.charAt(0));
		result.append(initial.charAt(1));
		return result.toString();
	}

}
