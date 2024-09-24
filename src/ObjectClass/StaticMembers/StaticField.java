package ObjectClass.StaticMembers;
import java.util.Date;

/* Nếu bạn muốn tất cả các phiên bản của một lớp chia sẻ một giá trị chung, chẳng hạn như biến toàn cục, thì tốt nhất bạn nên khai báo nó ở dạng tĩnh. Cách tiếp cận này có thể giúp tiết kiệm bộ nhớ vì tất cả các đối tượng được tạo đều có chung một bản sao của một biến tĩnh. */

public class StaticField {
    public static String staticStringField;
    public static int staticIntField;

    // more complex example
    public static Date lastCreated; // Trường ghi ngày của phiên bản được tạo gần đây nhất

    public StaticField() {
        lastCreated = new Date();
    }



}


class TestSomeClass {
    public static void main(String[] args) {
        StaticField.staticStringField = "Hello";
        StaticField.staticIntField = 10;

        // you can access static field without creating an instance of the class
        StaticField instance1 = new StaticField();
        StaticField instance2 = new StaticField();

        System.out.println(StaticField.staticStringField);
        System.out.println(StaticField.staticIntField);
        System.out.println(instance1.staticIntField);
        System.out.println(instance2.lastCreated);
    }
}