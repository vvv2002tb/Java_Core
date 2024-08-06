package ControlFlow;

public class BlockScope {
    public static void main(String[] args) {
        int n;
        {
            int k;
            // int n; Lỗi--không thể xác định lại n trong khối bên trong
        } // k is only defined up ( xac dinh ) to here.


    }
}
