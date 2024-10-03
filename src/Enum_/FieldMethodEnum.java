package Enum_;

/*
 * enum để định nghĩa các tập hợp biến không thể thay đổi.
 * enum có thể có các phương thức và trường.
 * Sau khi định nghĩa chúng, có thể chúng ta sẽ cần mở rộng chức năng của enum và thêm giá trị vào các hằng số.
 * 
 */

public class FieldMethodEnum {
    public static void main(String[] args) {
        System.out.println(ChargeLevel.LOW.getSections()); // 1
        System.out.println(ChargeLevel.LOW.getColor()); // red

        ChargeLevel level = ChargeLevel.findByNumSections(2);
        System.out.println(level);
    }
}

enum ChargeLevel {
    FULL(4, "green"), HIGH(3, "green"), MEDIUM(2, "gray"), LOW(20, "red");

    private final int sections;
    private final String color;

    ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }

    public static ChargeLevel findByNumSections(int numSections) {
        for (ChargeLevel level : ChargeLevel.values()) {
            if (level.getSections() == numSections) {
                return level;
            }
        }
        return null;
    }

}
