package Enum_;

/*
 * Enum là một kiểu dữ liệu đặc biệt cung cấp một tập hợp các hằng số được định nghĩa trước có tên.
 * Enum cung cấp một cách để định nghĩa và sử dụng các hằng số có tên, giúp code dễ đọc, dễ hiểu và tránh được việc sử dụng các hằng số "magic number" không có tên.
 */

public class EnumClass {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Wrong day");
                break;
        }
        
        // Một số phương thức của Enum
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season);
        }

        System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());

        // valueof
        Season season1 = Season.valueOf("WINTER");
        System.out.println("Season is: " + season1);

        // equals
        System.out.println("Season is equal to WINTER: " + season1.equals(Season.WINTER));
        System.out.println("Season is equal to SUMMER: " + season1.equals(Season.SUMMER));
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER;
}

enum Gender {
    MALE,
    FEMALE,
    OTHER;
}

enum UserStatus {
    ACTIVE,
    INACTIVE,
    BLOCKED;
}

