package LocalDateAndTime;

import java.time.LocalDate;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // return today
        System.out.println(now);

        LocalDate date1 = LocalDate.of(2017, 11, 25); // 2017-11-25 (25 November 2017)
        LocalDate date2 = LocalDate.parse("2017-11-25"); // 2017-11-25 (25 November 2017)

        System.out.println(date1);
        System.out.println(date2);

        // get day, month, ...
        int year = now.getYear();
        int month = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        int dayOfYear = now.getDayOfYear();

        System.out.println(month);
        System.out.println(year);
        System.out.println(dayOfMonth);
        System.out.println(dayOfYear);

        // Arithmetic methods of LocalDate
        date1.plusDays(1);
        date1.minusDays(2);
        date1.plusYears(1);
        date1.plusMonths(1);

        
    }
}
