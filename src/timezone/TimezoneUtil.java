package timezone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneUtil {
	public static Date convertDate(Date dateFrom) throws ParseException {
        SimpleDateFormat sdfFrom = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");

        SimpleDateFormat sdfTo = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
        sdfTo.setTimeZone(TimeZone.getTimeZone("IST"));

        Date dateTo = sdfFrom.parse(sdfTo.format(dateFrom));
        return dateTo;
    }
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		System.out.println(TimezoneUtil.convertDate(new Date("Mon May 31 08:42:43 UTC 2021")));
	}
}
