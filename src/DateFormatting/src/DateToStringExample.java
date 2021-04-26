import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStringExample {

    public static void main(String[] args) {
        Date date = Calendar.getInstance()
                .getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-dd-mm");
        String strDate = dateFormat.format(date);
        System.out.println("Converted String" + strDate);

    }

}
