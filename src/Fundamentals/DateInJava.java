import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInJava {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(date));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(date));

        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfWeekFormat.format(date));
    }
}
