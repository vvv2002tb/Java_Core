package WrapperClass;

/*
 * Wrapper Class là các lớp đại diện cho các kiểu dữ liệu nguyên thủy.  
 * Các lớp này cung cấp các phương thức để chuyển đổi giữa các kiểu dữ liệu nguyên thủy và đối tượng.
 * Sử dụng Wrapper với Collection Framework. như List, Set, Map, ...
 */

public class Wrapper {
    public static void main(String[] args) {
        Boolean a = true;
        Byte b = 10;
        Character c = 'a';
        Double d = 10.5;
        Float f = 10.5f;
        Integer i = 10;
        Long l = 10L;
        Short s = 10;
        String str = "10";

        // Boxing and Unboxing
        // Boxing là quá trình chuyển đổi kiểu dữ liệu nguyên thủy thành đối tượng.
        // Unboxing là quá trình chuyển đổi đối tượng thành kiểu dữ liệu nguyên thủy.

        // Boxing
        int primitive = 10;
        Integer reference = Integer.valueOf(primitive); // boxing
        int annotherPrimitive = reference.intValue(); // unboxing

        // Auto Boxing and Auto Unboxing
        double primitiveDouble = 10.5;
        Double wrapperDouble = primitiveDouble; // Auto Boxing
        double annotherPrimitiveDouble = wrapperDouble; // Auto Unboxing

        
        // Comparing wrappers
        // Khi sử dụng == để so sánh 2 đối tượng thì nó sẽ so sánh địa chỉ của 2 đối tượng.
        // Khi sử dụng equals() để so sánh 2 đối tượng thì nó sẽ so sánh giá trị của 2 đối tượng.
        Long i1 = Long.valueOf("1000");
        Long i2 = Long.valueOf("1000");
        System.out.println(i1 == i2); // false
        System.out.println(i1.equals(i2)); // true
        
        
        
    }
}
