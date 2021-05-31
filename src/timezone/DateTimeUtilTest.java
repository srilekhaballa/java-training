package timezone;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

class DateTimeUtilTest {
		
	@Test
	public void testCurrentTimeStampInUTC() {
		Instant currentTimeStampInUTC = DateTimeUtil.currentTimeStampInUTC();
		assertNotNull(currentTimeStampInUTC);
	}

		
	@Test
	public void testConvertLocalToUTC() {
		Date convertLocalToUTC = DateTimeUtil.convertLocalToUTC();
		assertNotNull(convertLocalToUTC);
	}
	
}
