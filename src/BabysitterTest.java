import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BabysitterTest {
	
	Babysitter babysitter;
	
	@Before
	public void setUp() {
		babysitter = new Babysitter();
	}
	
	@Test
	public void whenHoursBeforeBedtimeIsPassedANumberItReturnsThatNumber() {
        assertEquals(1, babysitter.hoursBeforeBedtime(1));
    }
	
	@Test
	public void whenHoursWorkedBeforeBedtimeIsPassedANumberItReturnsThatNumberTimesTwelve() {
        assertEquals(12, babysitter.hoursWorkedBeforeBedtime(1));
        assertEquals(24, babysitter.hoursWorkedBeforeBedtime(2));
    }
	
	@Test
	public void whenHoursWorkedBetweenBedtimeAndMidnightIsPassedANumberItReturnsThatNumberTimesEight() {
        assertEquals(8, babysitter.hoursWorkedBetweenBedtimeAndMidnight(1));
        assertEquals(16, babysitter.hoursWorkedBetweenBedtimeAndMidnight(2));
    }
	
	@Test
	public void whenHoursWorkedBetweenMidnightAndEndIsPassedANumberItReturnsThatNumberTimesSixteen() {
        assertEquals(16, babysitter.hoursWorkedBetweenMidnightAndEnd(1));
        assertEquals(32, babysitter.hoursWorkedBetweenMidnightAndEnd(2));
    }
	
	@Test
	public void whenTotalHoursWorkedIsPassedAStartTimeAndEndTimeItReturnsTotalNumberOfHours() {
        assertEquals(7, babysitter.TotalHoursWorked(5,12));
        assertEquals(9, babysitter.TotalHoursWorked(5,2));
    }
	
	@Test
	public void whenTotalHoursWorkedBeforeBedtimeIsPassedAStartTimeAndEndTimeAndBedtimeItReturnsTotalNumberOfHoursWorkedBeforeBedtime() {
        assertEquals(3, babysitter.TotalHoursWorkedBeforeBedtime(5,12,8));
        assertEquals(4, babysitter.TotalHoursWorkedBeforeBedtime(5,2,9));
    }

}