// SRM 609 DIV 2 - 500 points

public class PackingBallsDiv2 {

	public int minPacks(int R, int G, int B) {
		int m1 = method1( R,  G,  B);
		int m2 = method2( R,  G,  B);
		int packages = (m1 < m2) ? m1 : m2;
		return packages;
	}

	private int method2(int R, int G, int B) {
		int packages = 0;
		packages += R/3;
		packages += G/3;
		packages += B/3;
		R %= 3;
		G %= 3;
		B %= 3;
		
		if((R == 2 && G == 0 && B == 0) || (R == 0 && G == 2 && B == 0) || (R == 0 && G == 0 && B == 2)) {
			packages++;
		}
		else {
			int largest = (R > G) ? R : G;
			if (largest < B) {
				largest = B;
			}
			packages += largest;
		}

		return packages;
	}
	
	private int method1(int R, int G, int B) {
		int smallest = (R < G) ? R : G;
		if (smallest > B) {
			smallest = B;
		}
		int packages = smallest;
		packages += getIndividualPackages(R-smallest);
		packages += getIndividualPackages(G-smallest);
		packages += getIndividualPackages(B-smallest);
		return packages;	
	}
	
	private int getIndividualPackages(int remain) {
		if(remain > 0) {
			if(remain%3 != 0 ) {
				return (remain/3) + 1;
			}
			return (remain/3);
		}
		return 0;
	}
}
