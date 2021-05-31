package timezone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DateTimeUtil {
	
	private static final Logger logger = LogManager.getLogger("DateTimeUtil.class");
	
	public static Instant currentTimeStampInUTC() {
		
		OffsetDateTime now = OffsetDateTime.now( ZoneOffset.UTC );
		logger.info("currentTimestampinUTC: "+now);
		logger.info( "UTC/GMT date-time in ISO 8601 format: " + new org.joda.time.DateTime( org.joda.time.DateTimeZone.UTC ) );
		Instant instant = Instant.now();
		logger.info("current Timestamp in UTC: ");
		return instant;
	}
	
	public static Date convertUTCToLocalTimeZone(Date dateFrom) throws ParseException {
        SimpleDateFormat sdfFrom = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");

        SimpleDateFormat sdfTo = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
        sdfTo.setTimeZone(TimeZone.getTimeZone("IST"));

        Date dateTo = sdfFrom.parse(sdfTo.format(dateFrom));
        return dateTo;
    }

	public static String getCurrentTimeZone(){
	        TimeZone tz = Calendar.getInstance().getTimeZone();
	        logger.info(tz.getDisplayName());
	        return tz.getID();
	}
	
	public static Date convertLocalToUTC() {
	    Date date = new Date();
	    TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
        return date;
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		
		BasicConfigurator.configure();
		logger.info(currentTimeStampInUTC());
		logger.info("convert UTC to Local timezone: "+convertUTCToLocalTimeZone(new Date("Mon May 31 08:42:43 UTC 2021")));
		logger.info("convert local to UTC timezone: "+convertLocalToUTC());
	}
}
