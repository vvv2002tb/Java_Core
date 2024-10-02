package LocalDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_ {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime dt1 = LocalDateTime.of(2017, 11, 25, 22, 30);  // 25 November 2017, 22:30
        LocalDateTime dt2 = LocalDateTime.parse("2017-11-25T22:30"); // 25 November 2017, 22:30

        LocalDate date = LocalDate.of(2017, 11, 25); // 2017-11-25
        LocalTime time = LocalTime.of(21, 30); // 21:30

        LocalDateTime dateTime = LocalDateTime.of(date, time); // 2017-11-25T21:30


        LocalDateTime dateTime1 = date.atTime(time); // 2017-11-25T21:30
        LocalDateTime dateTime2 = time.atDate(date); // 2017-11-25T21:30
    }
}
