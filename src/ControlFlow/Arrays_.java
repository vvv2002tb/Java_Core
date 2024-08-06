package ControlFlow;

import java.util.Arrays;

public class Arrays_ {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);

        // Nhược điểm của arr là luôn luôn phụ thuộc vào index.

        /* Bạn có thể sao chép một biến mảng sang một biến mảng khác, nhưng sau
         đó cả hai biến đều tham chiếu đến cùng một mảng:  */

        int[] arr2 = a;
        System.out.println(arr2[1]); // output = 2
        a[1] = 3;
        System.out.println(arr2[1]); // output = 3


        arrSorting();
    }

    private static void arrSorting() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }


}
