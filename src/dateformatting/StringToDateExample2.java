package dateformatting;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class StringToDateExample2 {

	private static final Logger logger = java.util.logging.Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) throws Exception {
        String sDate1 = "26/04/2021";
        String sDate2 = "26-Apr-2021";
        String sDate3 = "04 26, 2021";
        String sDate4 = "Mon, Apr 26 2021";
        String sDate5 = "Mon, Apr 26 2021 23:37:50";
        String sDate6 = "26-Apr-2021 23:37:50";
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat formatter3 = new SimpleDateFormat("MM dd, yyyy");
        SimpleDateFormat formatter4 = new SimpleDateFormat("E, MMM dd yyyy");
        SimpleDateFormat formatter5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
        SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date date1 = formatter1.parse(sDate1);
        Date date2 = formatter2.parse(sDate2);
        Date date3 = formatter3.parse(sDate3);
        Date date4 = formatter4.parse(sDate4);
        Date date5 = formatter5.parse(sDate5);
        Date date6 = formatter6.parse(sDate6);
        logger.info(sDate1 + "\t" + date1);
        logger.info(sDate2 + "\t" + date2);
        logger.info(sDate3 + "\t" + date3);
        logger.info(sDate4 + "\t" + date4);
        logger.info(sDate5 + "\t" + date5);
        logger.info(sDate6 + "\t" + date6);
    }

}
