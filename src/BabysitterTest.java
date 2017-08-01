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

}