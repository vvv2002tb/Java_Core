package Strings;

/* Về mặt khái niệm chuỗi Java là  chuỗi các ký tự Unicode */

public class Strings {
    public static void main(String[] args) {
        String e = ""; // an empty string
        String greeting = "hello";

//        subStrings();
//        concatenation();
//        stringsImmutable();
//        equalStrings();
        emptyAndNull();

    }

    private static void subStrings() {
        /* Bạn có thể trích xuất một chuỗi con từ một chuỗi lớn hơn bằng
        phương thức chuỗi con của Lớp chuỗi
         */

        String greeting = "Hello";
        String s = greeting.substring(0, 3);
        System.out.println(s);
        // output: "Hel"

    }

    private static void concatenation() {
        // nối chuỗi có nhiều cách:
        // by +
        String firstName = "Cristiano ";
        String lastName = "Ronaldo ";
        String ronaldo = firstName + lastName;
        System.out.println(ronaldo);

        int age = 40;
        String fullInfo = ronaldo + age;
        System.out.println(fullInfo);
        // other way
        System.out.println(ronaldo + age);

        /* Nếu bạn cần ghép nhiều chuỗi lại với nhau, cách nhau bằng dấu phân
         cách, hãy sử dụng phương pháp nối tĩnh:
         */

        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);
        // output S / M / L / XL
    }

    private static void stringsImmutable() {
        // Tạo một đối tượng String
        String originalString = "Hello";

        // Gán originalString cho một biến khác
        String anotherString = originalString;

        // In ra giá trị của cả hai biến
        System.out.println("originalString: " + originalString); // Output: Hello
        System.out.println("anotherString: " + anotherString);   // Output: Hello

        // Thay đổi giá trị của originalString
        originalString = "World";

        // In ra giá trị của cả hai biến sau khi thay đổi
        System.out.println("originalString (sau khi thay đổi): " + originalString); // Output: World
        System.out.println("anotherString (sau khi thay đổi originalString): " + anotherString); // Output: Hello
    }

    private static void equalStrings() {
        // To test whether two strings are equal, use the equals method.
        String s = "Hello";
        Boolean check = "Hello".equals(s);
        Boolean check1 = "hello".equals(s);
        Boolean check2 = "hello".equalsIgnoreCase(s);
        System.out.println(check);
        System.out.println(check1);
        System.out.println(check2);

        // Lưu ý: Không sủ dụng toán tử == để so sánh
//        Boolean check3 = ("Hello" == "hello") ? true : false; // Invalid
    }

    private static void emptyAndNull() {
        /* The empty string "" is a string of length 0. You can test whether
        a string is empty by calling */
        String string = "";
        Boolean checkEmpty = string.isEmpty();
        System.out.println(checkEmpty);

        // check by length
        Boolean checkEmpty1 = (string.length() == 0) ? true : false;

        // check by equal
        Boolean checkEmpty2 = (string.equals("")) ? true : false;

        /* Định nghĩa: null là một từ khóa trong Java, biểu thị rằng biến không
         tham chiếu đến bất kỳ đối tượng nào. Khác vs "", "" vẫn có đ/c.
         */

        String string1 = null;
//        System.out.println(string1.isEmpty()); // false Cannot invoke "String.isEmpty()" because "string1" is null
        System.out.println(string1 == null); // true



    }


}
