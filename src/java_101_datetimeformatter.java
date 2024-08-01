import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df3 = DateTimeFormatter.ISO_LOCAL_TIME;

        String myDate = dt.format(df);
        String myDate2 = dt.format(df2);
        String myDate3 = dt.format(df3);
        System.out.println(myDate);
        System.out.println(myDate2);
        System.out.println(myDate3);
    }
}
