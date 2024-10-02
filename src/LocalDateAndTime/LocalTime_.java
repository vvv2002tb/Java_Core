package LocalDateAndTime;

import java.time.LocalTime;

public class LocalTime_ {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println(LocalTime.of(11, 45));
        System.out.println(LocalTime.of(11, 45, 30));
        System.out.println(LocalTime.parse("11:45:30"));

        LocalTime time = LocalTime.ofSecondOfDay(12345); // 03:25:45
        LocalTime nanotime = LocalTime.ofNanoOfDay(1234567890); // 00:00:01.234567890

//        LocalTime a = LocalTime.MIN; // 00:00
//        LocalTime.MAX; // 23:59:59.999999999
//        LocalTime.NOON; // 12:00
//        LocalTime.MIDNIGHT; // 00:00


        LocalTime time1 = LocalTime.of(11, 45, 30); // 11:45:30
//        time1.getHour();   // 11
//        time1.getMinute(); // 45
//        time1.getSecond(); // 30
//        time1.getNano();   // 0, nanoseconds
        //time.toSecondOfDay(); // 42330

        LocalTime time2 = time.plusHours(22); // 09:45:30
        LocalTime time3 = time.minusMinutes(10); // 11:35:30
        LocalTime time4 = time.minusSeconds(30); // 11:45


    }
}
