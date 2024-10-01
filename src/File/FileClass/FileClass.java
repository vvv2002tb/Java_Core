package File.FileClass;

import java.io.File;

/*
* Lớp này có thể được sử dụng để thao tác với các tệp và thư mục: tạo, xóa, truy cập các thuộc tính và hơn thế nữa.
*/

public class FileClass {
    public static void main(String[] args) {
        File fileOnUnix = new File("/home/username/Documents");    // a directory on a UNIX-like system
        File fileOnWin = new File("D:\\Materials\\java-materials.pdf"); // a file on Windows

        System.out.println("-".repeat(10));
        System.out.println(fileOnUnix);

        // basic method
        System.out.println(fileOnUnix.getPath()); // return the string path
        // to this file or directory

        //String getName() returns the name of this file or directory (just the last name of the path)
        System.out.println(fileOnUnix.getName());

        //boolean isDirectory() returns true if it is a directory and exists, otherwise, false;
        System.out.println(fileOnWin.isDirectory()); // return false

        //boolean isFile() returns true if it is a file that exists (not a directory), otherwise, false;
        System.out.println(fileOnWin.isFile());

        //boolean exists() returns true if this file or directory actually exists in your file system, otherwise, false;
        System.out.println(fileOnWin.exists());

        //String getParent() returns the string path to the parent directory that contains this file or directory.
        System.out.println(fileOnUnix.getParent());


//        File docs = new File("src/File/FileClass/docs.txt");
//        System.out.println(docs.canWrite());

    }
}
