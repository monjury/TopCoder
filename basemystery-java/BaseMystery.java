import java.util.ArrayList;

//SRM 158 DIV 2 - 500 points
public class BaseMystery {

	private int minBase;
	private int firstLen;
	private int secondLen;
	private int sumLen;
	private char[] first;
	private char[] second;
	private char[] sum;

	public int[] getBase(String equation) {

		firstLen = equation.split("\\+")[0].length();
		secondLen = equation.split("\\+")[1].split("=")[0].length();
		sumLen = equation.split("=")[1].length();

		first = equation.split("\\+")[0].toCharArray();
		second = equation.split("\\+")[1].split("=")[0].toCharArray();
		sum = equation.split("=")[1].toCharArray();

		minBase = 0;
		setMinBase(first);
		setMinBase(second);
		setMinBase(sum);
		
		if(minBase < 2) {
			minBase = 2;
		}

		ArrayList<Integer> retArr = new ArrayList<>();
		for (int i = minBase; i <= 20; i++) {
			if (validSummation(i)) {
				retArr.add(i);
			}
		}
		return getArray(retArr);
	}

	private boolean validSummation(int base) {
		int i = firstLen - 1;
		int j = secondLen - 1;
		int k = sumLen - 1;
		int summation = 0;
		int carry = 0;
		while (k >= 0) {
			
			int firstValue = (i >= 0) ? getIntValue(first[i]) : 0;
			int secondValue = (j >= 0) ? getIntValue(second[j]) : 0;
			
			summation = (firstValue + secondValue + carry) % base;
			carry = (firstValue + secondValue + carry) / base;

			if (summation != getIntValue(sum[k])) {
				return false;
			}
			if(carry > 0 && k == 0) {
				return false;
			}
			i--;
			j--;
			k--;
		}
		return true;
	}

	private void setMinBase(char[] cArray) {
		for (char c : cArray) {
			int x = getIntValue(c);
			if (x >= minBase) {
				minBase = x;
				minBase++;
			}
		}
	}

	private int getIntValue(char c) {
		return (c >= 65 && c <= 74) ? c - 55 : Character.getNumericValue(c);
	}

	private int[] getArray(ArrayList<Integer> input) {
		int[] returnArray = new int[input.size()];
		int index = 0;
		for (int i : input) {
			returnArray[index++] = i;
			System.out.println(i + ", ");
		}
		return returnArray;
	}
}
