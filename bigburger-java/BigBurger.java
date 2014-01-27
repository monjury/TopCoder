// SRM 149 DIV 2 - 500 points
public class BigBurger {
	
	public int maxWait(int[] arrival, int[] service) {
		int maximumWaitTime = 0;
		int waitTime = 0;
		int currentTime = 0;
		int i = 0;
		while(i < arrival.length) {
			if(currentTime < arrival[i]) {
				currentTime = arrival[i] + service[i];
				waitTime = 0;
			}
			else {
				waitTime = currentTime - arrival[i];
				currentTime += service[i];
			}
			
			if(waitTime > maximumWaitTime) {
				maximumWaitTime = waitTime;
			}
			i++;
		}
		return maximumWaitTime;
	}
}