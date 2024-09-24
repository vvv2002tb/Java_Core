package ObjectClass.StaticMembers;

/* 
 * Static method là phương thức thuộc tính của lớp chứ không phải của đối tượng. 
 * một phương thức tĩnh chỉ có thể truy cập các trường tĩnh và không thể truy cập các trường không tĩnh;
 * Không thể dùng this trong static method
 * Không thể dùng super trong static method
 * Không thể dùng static method để gọi các phương thức không tĩnh
 * Các phương thức tĩnh thường được sử dụng làm phương thức tiện ích giống nhau cho toàn bộ dự án. Ví dụ: bạn có thể tạo một lớp chỉ có các phương thức tĩnh để thực hiện các phép toán thông thường. VD Math.pow(), Arrays.sort(), ... 


 */

public class StaticMethod {
    private int nonStaticIntField;
    private static int staticIntField;

    public static void staticMethod() {
        System.out.println("This is a static method");
        // nonStaticMethod(); // it's wrong.
        // this.nonStaticIntField; // it's wrong.
        // this.staticIntField; // it's wrong.
        StaticMethod.staticIntField = 10; // it's ok
        //StaticField.nonStaticIntField = 20; // it's wrong 
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method");
        staticMethod(); // it's ok
        StaticMethod.staticMethod(); // it's ok
    }


}
