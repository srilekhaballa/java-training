package dateformatting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DateToStringExample {
	
	private static final Logger logger = LogManager.getLogger("DateToStringExample.class");
    public static void main(String[] args) {
        Date date = Calendar.getInstance()
                .getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-dd-mm");
        String strDate = dateFormat.format(date);
        logger.info("Converted String" + strDate);

    }

}
