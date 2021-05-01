package DateFormatting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

public class GMTtoIST {

	private static final Logger logger = java.util.logging.Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		  Date date = new Date();
		  DateFormat istFormat = new SimpleDateFormat();
		  DateFormat gmtFormat = new SimpleDateFormat();
		  TimeZone gmtTime = TimeZone.getTimeZone("GMT");
		  TimeZone istTime = TimeZone.getTimeZone("IST");
		  
		  istFormat.setTimeZone(gmtTime);
		  gmtFormat.setTimeZone(istTime);
		  logger.info("GMT Time: " + istFormat.format(date));
		  logger.info("IST Time: " + gmtFormat.format(date));
	}
}

	