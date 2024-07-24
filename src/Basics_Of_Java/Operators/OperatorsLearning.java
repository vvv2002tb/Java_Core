package Basics_Of_Java.Operators;

/*  What are the Java Operators?
    Toán tử trong Java là các ký hiệu được sử dụng để thực hiện các thao tác cụ
    thể trong Java. Các toán tử thực hiện các tác vụ như cộng, nhân, v.v. trông
    có vẻ dễ dàng mặc dù việc thực hiện các tác vụ này khá phức tạp.

 * */

public class OperatorsLearning {
    public static void main(String[] args) {
//        arithmeticOperators();
//        unaryOperators();
//        assignmentOperators();
//        relationalOperators();
//        logicalOperators();
//        ternaryOperator();
        instanceofOperator();
    }


    public static void arithmeticOperators() {
        // toan tu so hoc + - * / %
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

    }

    public static void unaryOperators() {
        // Toán tử một ngôi chỉ cần một toán hạng. Chúng được sử dụng để tăng,
        // giảm hoặc phủ định một giá trị. VD: ++, --, !
        int a = 10;
        int b = 10;

        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

    }

    public static void assignmentOperators() {
        // "=", "+=", "-=" "*=", "/=", "%="

    }

    public static void  relationalOperators() {
        /* Các toán tử này được sử dụng để kiểm tra các mối quan hệ như đẳng thức,
         lớn hơn và nhỏ hơn. Chúng trả về kết quả boolean sau khi so sánh và được
         sử dụng rộng rãi trong các câu lệnh lặp cũng như các câu lệnh if-else có
         điều kiện.  */

        // ==, !=, <, <=, >, >=

        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

    }

    public static void logicalOperators() {
        // &&: AND, ||: Or, !: not
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

    }

    public static void ternaryOperator() {
        // toan tu bac 3
        // condition ? if true : if false

        int a = 1;
        int b = 10;
        int result;
        result = a > b ? a : b;
        System.out.println(result);

    }

    public static void instanceofOperator() {
        String a = "Hello";
        System.out.println(a instanceof String);
    }






}
