
public class Babysitter {

	public Object hoursBeforeBedtime(int i) {
		return i;
	}

	public Object hoursWorkedBeforeBedtime(int i) {
		return i*12;
	}

	public Object hoursWorkedBetweenBedtimeAndMidnight(int i) {
		return i*8;
	}

	public Object hoursWorkedBetweenMidnightAndEnd(int i) {
		return i*16;
	}

	public Object TotalHoursWorked(int i, int j) {
		if(j<5) 
			return 12-i+j;
		else 
			return j-i;
	}

	public Object TotalHoursWorkedBeforeBedtime(int i, int j, int k) {
		return k-i;
	}

	public Object TotalHoursWorkedBetweenBedtimeAndMidnight(int i, int j, int k) {
		return 12-k;
	}

	public Object TotalHoursWorkedBetweenMidnightAndEnd(int i, int j) {
		if(j<5)
			return j;
		else
			return 0;
	}

}
