package ObjectClass.StaticMembers;

/* Các trường tĩnh có từ khóa cuối cùng là hằng số lớp, có nghĩa là chúng không thể thay đổi. Theo quy ước đặt tên, các trường hằng phải luôn được viết bằng chữ hoa với dấu gạch dưới (_) để phân tách các phần của tên. 
 * Các hằng số thường public, đó không phải là một quy tắc.
*/

public class FinalField {
    public static final int MAX_VALUE = 100;
    public static final double PI = 3.14159265358979323846;
    
}

class Physics {
    /**
     * The speed of light in a vacuum (m/s)
     */
    public static final long SPEED_OF_LIGHT = 299_792_458;

    /**
     * Electron mass (kg)
     */
    public static final double ELECTRON_MASS = 9.1093837e-31;
}

/**
 * Test final field
 */
class Test {
    public static void main(String[] args) {
        System.out.println(Physics.SPEED_OF_LIGHT);
        System.out.println(Physics.ELECTRON_MASS);
    }

        
}
