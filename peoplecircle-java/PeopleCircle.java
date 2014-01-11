import java.util.ArrayList;

public class PeopleCircle {

	/**
	 * BASIC STRATEGY
	 * 
	 *  1. ASSIGN ALL SPOTS TO MALE [in male array]
	 *  2. DETERMINE WHICH SPOTS FOR FEMALE
	 *  	a. ASSIGN FEMALE SPOTS TO FEMALE [in female array]
	 *      b. REMOVE THOSE SPOTS FROM MALE
	 *      c. REARRANGE MALE SPOTS
	 *  3. NOTE - MALE AND FEMALE SPOTS ARE MUTUALLY EXCLUSIVE
	 *	4. BUILD FINAL STRING FROM MALE AND FEMALE SPOTS   
	 */
	public String order(int numMales, int numFemales, int K) {
		int totalLength = numMales + numFemales;
		ArrayList<Integer> male = initializeMaleIndex(totalLength);
		ArrayList<Integer> female = generateFemaleIndices(numFemales, K, male);
		String finalString = createFinalString(totalLength, female);
		return finalString;
	}

	/* 1. ASSIGN ALL SPOTS TO MALE [in male array] */
	private ArrayList<Integer> initializeMaleIndex(int totalLength) {
		ArrayList<Integer> male = new ArrayList<Integer>();
		for (int i = 0; i < totalLength; i++) {
			male.add(i);
		}
		return male;
	}
		
	/*
	 * 	2. DETERMINE WHICH SPOTS FOR FEMALE
	 *  	a. ASSIGN FEMALE SPOTS TO FEMALE [in female array]
	 *      b. REMOVE THOSE SPOTS FROM MALE
	 *      c. REARRANGE MALE SPOTS
	 */
	private ArrayList<Integer> generateFemaleIndices(int numFemales, int K, ArrayList<Integer> male) {
		ArrayList<Integer> female = new ArrayList<Integer>();
		for (int i = 0; i < numFemales; i++) {
			int index = K - 1;
			index %= male.size();
			int femaleIndex = male.get(index);
			female.add(femaleIndex);
			male.remove(index);
			male = shiftMaleArray(male, index);
		}
		return female;
	}

	/*  2c. REARRANGE MALE SPOTS */
	private ArrayList<Integer> shiftMaleArray(ArrayList<Integer> initial, int startIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (startIndex > initial.size()) {
			startIndex %= initial.size();
		}
		if (startIndex == 0) {
			return initial;
		}
		for (int i = startIndex; i < initial.size(); i++) {
			result.add(initial.get(i));
		}
		for (int i = 0; i < startIndex; i++) {
			result.add(initial.get(i));
		}
		return result;
	}

	/* 4. BUILD FINAL STRING FROM MALE AND FEMALE SPOTS */
	private String createFinalString(int totalLength, ArrayList<Integer> female) {
		char[] circularArray = new char[totalLength];
		for (int i = 0; i < totalLength; i++) {
			circularArray[i] = female.contains(i) ? 'F' : 'M';
		}
		String order = new String(circularArray);
		return order;
	}

	
}
