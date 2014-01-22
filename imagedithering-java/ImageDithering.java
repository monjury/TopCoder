public class ImageDithering {
	
	// SRM 145 DIV 2 - 250 points
	
	public int count(String dithered, String[] screen) {
		int count = 0;
		for(String currentScreen : screen) {
			for(int i = 0; i < currentScreen.length(); i++) {
				if(dithered.contains(String.valueOf(currentScreen.charAt(i)))) {
					count++;
				}
			}
		}
		return count;
	}

}
