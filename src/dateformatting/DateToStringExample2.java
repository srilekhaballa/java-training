package dateformatting;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DateToStringExample2 {
	
	private static final Logger logger = LogManager.getLogger("DateToStringExample2.class");
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        logger.info("Date Format with MM/dd/yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        logger.info("Date Format with dd-M-yyyy hh:mm:ss : " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        logger.info("Date Format with dd MMMM yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        logger.info("Date Format with dd MMMM yyyy zzzz : " + strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        logger.info("Date Format with E, dd MMM yyyy HH:mm:ss z : " + strDate);
    }


}
