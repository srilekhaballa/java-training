package dateformatting;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class StringToDateExample1 {
	
	private static final Logger logger = java.util.logging.Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) throws Exception {
        String sDate1 = "26/04/2021";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        logger.info(sDate1 + "\t" + date1);

    }

}
