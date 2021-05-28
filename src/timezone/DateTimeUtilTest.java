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
	public void testConvertUTCToLocalTimeZone() {
		assertEquals(DateTimeUtil.convertUTCToLocalTimeZone("2021-05-28 09:04:06"),"2021-05-28 14:34:06");
	}
	
	@Test
	public void testConvertLocalToUTC() {
		Date convertLocalToUTC = DateTimeUtil.convertLocalToUTC();
		assertNotNull(convertLocalToUTC);
	}
	
}
