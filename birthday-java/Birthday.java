// SRM 151 DIV 2 - 500 points
public class Birthday {

	public String getNext(String date, String[] birthdays) {
		int minimumDifferenceOfDates = 365;
		int minIndex = 0;
		
		for(int i = 0; i < birthdays.length; i++) {
			int differenceOfDates =  getDifferenceOfDates(date, birthdays[i].substring(0, 5));
			if(differenceOfDates >= 0  && differenceOfDates < minimumDifferenceOfDates) {
				minimumDifferenceOfDates = differenceOfDates;
				minIndex = i;
			}
		}
		return birthdays[minIndex].substring(0, 5);
	}

	private int getDifferenceOfDates(String today, String upcoming) {
		
		int numOfDaysPassedTillToday = getNumberOfDaysPassed(today);
		int numOfDaysPassedTillUpcoming = getNumberOfDaysPassed(upcoming);
		if(numOfDaysPassedTillUpcoming >= numOfDaysPassedTillToday) {
			return numOfDaysPassedTillUpcoming - numOfDaysPassedTillToday;
		}
		else {
			return (365 - numOfDaysPassedTillToday) + numOfDaysPassedTillUpcoming;
		}
	}
	
	private int getNumberOfDaysPassed(String date) {
		int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int month = Integer.parseInt(date.substring(0, 2));
		int day = Integer.parseInt(date.substring(3, 5));
		
		int numOfDaysPassed = 0;
		int i = 0;
		while(i < month - 1) {
			numOfDaysPassed += numDays[i++];
		}
		numOfDaysPassed += numDays[month - 1] + day;
		return numOfDaysPassed;
	}
	
}
