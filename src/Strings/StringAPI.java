package Strings;

/*
    The String class in Java contains more than 50 methods.

*/

public class StringAPI {
    public static void main(String[] args) {
        String greeting = "Hello";
        // charAt
        System.out.println(greeting.charAt(1)); // output: e
        // codePointAt
        System.out.println(greeting.codePointAt(0)); // Trả về code ASCII
        //equal, equalsIgnoreCase done

        // compareTo
        System.out.println(greeting.compareTo("Hello")); // output: 0 is true

        // indexOf, • int indexOf(String str, int fromIndex)
        System.out.println(greeting.indexOf("o")); // index = 4
        System.out.println(greeting.indexOf("l", 3)); // index = 3
        int codePoint = greeting.codePointAt(3);
        System.out.println(greeting.indexOf(codePoint));

        // lastIndexOf, lastIndexOf(String str, int fromIndex)
        System.out.println(greeting.lastIndexOf("l"));

        // length() - done

        // string replace
        String hi = "hi";
        System.out.println(hi.replace("i", "ello"));

        // substring
        String name = "VinhDoan";
        System.out.println(name.substring(0, 4));

        //toUpCase, toLowwer
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // trim()
        /*trả về một chuỗi mới bằng cách loại bỏ tất cả khoảng trắng ở đầu và
         cuối trong chuỗi gốc
         */
        String needHandle = " Vinh Doan   ";
        System.out.println(needHandle.trim());

        // join()
        String message = String.join("-", "Java", "is", "cool");
        System.out.println(message);




    }
}
