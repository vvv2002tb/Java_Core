package Strings;

/*
    Đôi khi, bạn cần xây dựng các chuỗi từ các chuỗi ngắn hơn, chẳng hạn như tổ hợp phím
    hoặc các từ trong một tập tin. Sẽ không hiệu quả nếu sử dụng nối chuỗi cho việc này
    mục đích. Mỗi khi bạn nối các chuỗi, một đối tượng Chuỗi mới sẽ được tạo.
    Điều này gây tốn thời gian và lãng phí bộ nhớ. Sử dụng lớp StringBuilder sẽ tránh được
    vấn đề này.

 */

public class BuildingString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        //builder.append(ch); // appends a single character
        //builder.append(str); // appends a string
        builder.append("Hello");
        String completedString = builder.toString();
        System.out.println(builder);

        stringsBuilderAPI();

    }


    private static void stringsBuilderAPI() {
        StringBuilder stringBuilder = new StringBuilder();
        // append, • StringBuilder appendCodePoint(int cp)
        stringBuilder.append("Hello");
        stringBuilder.appendCodePoint(33); // 33 = '!'
        System.out.println(stringBuilder);

        // • int length()
        System.out.println(stringBuilder.length());

        // setCharAt
        char dot = '.';
        stringBuilder.setCharAt(5, dot);
        System.out.println(stringBuilder);

        // insert - • StringBuilder insert(int offset, String str)
        stringBuilder.insert(6, '.');
        System.out.println(stringBuilder);




    }
}
