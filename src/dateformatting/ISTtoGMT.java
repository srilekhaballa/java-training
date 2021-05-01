package dateformatting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;
	  
public class ISTtoGMT {
	  
	private static final Logger logger = java.util.logging.Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args)
	    {
	      Date localTime = new Date();
	      DateFormat s = new SimpleDateFormat("dd/MM/yyyy"
	                                            + " "
	                                            + " HH:mm:ss");
	  	  s.setTimeZone(TimeZone.getTimeZone("GMT"));
	      logger.info("local Time:" + localTime);
	      logger.info("Time IN Gmt : "
	                           + s.format(localTime));
	    }
	}

