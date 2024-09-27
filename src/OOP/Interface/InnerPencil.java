package OOP.Interface;

interface DrawingTool {
    void draw(
    ); // khai báo phương thức draw, không thực hiện phương thức trong body 

    // muốn triển khai 1 phương thức trong interface, ta phải sử dụng static
    // static là phương thức của interface, không phải phương thức của class
          
    static void staticMethod() {
        System.out.println("Interface: static method");
    }
        
    default void defaultMethod() {
        System.out.println("Interface: default method");
    }

    private void privateMethod() {
        System.out.println("Interface: private method");
    }
}

/**
 * Pencil
 */
class Pencil implements DrawingTool {
    @Override
    public void draw() {
        System.out.println("The way to draw with a pencil");
    }
}

class Brush implements DrawingTool {
    @Override
    public void draw() {
        System.out.println("The way to draw with a brush");
    }
}

class Test {
    public static void main(String[] args) {
        DrawingTool pencil = new Pencil();
        DrawingTool brush = new Brush();
        pencil.draw();
        brush.draw();
    }
}
    

