// SRM 163 DIV 2 - 500 
public class CalendarRecycle {

	public int useAgain(int year) {
		int y = year;
		// 1. Set day of week pointer to zero
		// 2. Get remaining number of days after full weeks in a year (365 % 7)
		// 3. with incrementing years add up extra days till pointer set back to 0
				
		int dayOfWeek = 0;
		do {
			year++;
			if(isLeapYear(year)) {
				dayOfWeek += 2;
			} 
			else {
				dayOfWeek += 1;
			}	
			
			
			if(dayOfWeek % 7 == 0 && isLeapYear(y) == isLeapYear(year)) {
				break;
			}
		} 
		while (true);
		return year;
	}


	private boolean isLeapYear(int year) {
		return (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)));
	}
}
