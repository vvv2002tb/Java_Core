package Datatypes;

public class Casts {
    public static void main(String[] args) {
        // ép kieu
        double x = 9.997;
        int nx = (int) x;
        System.out.println(nx);
        // output = 9

        // round a floating-point
        int nx1 = (int) Math.round(x);
        System.out.println(nx1);
        // output = 10;

    }
}
