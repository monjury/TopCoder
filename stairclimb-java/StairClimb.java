// SRM 168 DIV 2 - 250 Stair Climb 

public class StairClimb {

	public int stridesTaken(int[] flights, int stairsPerStride) {
		int totalStrides = 0;
		if(flights != null) {
			for(int flight : flights) {
				totalStrides += (flight / stairsPerStride);
				totalStrides += (flight % stairsPerStride > 0) ? 1 : 0;
				totalStrides += 2;
			}
			totalStrides -=2;
		}
		
		return totalStrides;
	}
}
