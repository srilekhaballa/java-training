package timezone;

import java.text.DateFormat;
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
	
	public static  String convertUTCToLocalTimeZone(String Date) {
		String converted_date = "";
        try {

            DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

            Date date = utcFormat.parse(Date);

            DateFormat currentTFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            currentTFormat.setTimeZone(TimeZone.getTimeZone(getCurrentTimeZone()));

            converted_date =  currentTFormat.format(date);
        }catch (Exception e){ 
        	e.printStackTrace();
        }

        return converted_date;
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
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger.info(currentTimeStampInUTC());
		logger.info("convert UTC to Local timezone: "+convertUTCToLocalTimeZone("2021-05-28 09:04:06"));
		logger.info("convert local to UTC timezone: "+convertLocalToUTC());
	}
}
