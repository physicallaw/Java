package calander;

public class Date {
	/*
	private int year;
	private int month;
	private int date;
	*/
	
	public boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		else if (year % 100 == 0)
			return false;
		else if (year % 4 == 0)
			return true;
		else
			return false;
	}
	
	public int getMonthLastDay(int year, int month) {
		int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year % 400 == 0)
			++arr[2];
		else if (year % 100 == 0)
			;
		else if (year % 4 == 0)
			++arr[2];
		
		return arr[month];
	}
	
	public int getWeekday(int year, int month, int day) {
		int total = 0;
		
		for (int i = 1; i < year; ++i)
			if (isLeapYear(year))
				total += 366;
			else
				total += 365;
		
		for (int i = 1; i < month; ++i)
			total += getMonthLastDay(year, month);
		
		total += day;
		
		return total % 7;
	}
}