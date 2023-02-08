package Interface.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DemoDateTimeAPI {
    public static void main(String[] args) {
        LocalDate iAmDate = LocalDate.now();
        LocalTime iAmTime = LocalTime.now();
        LocalDateTime iAmDateAndTime = LocalDateTime.now();

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate d1 = LocalDate.of(1997, Month.MARCH, 12);
        System.out.println(d1);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
