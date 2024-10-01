package File.FileClass;

import java.io.File;
import java.io.IOException;

public class ManagingFiles {
    public static void main(String[] args) {
        createFile();
        createDirectories();
//        removeFile();
    }

    private static void createFile() {
        File file = new File("src/File/FileClass/Test/file.txt");
        try {
            boolean createdNew = file.createNewFile();
            if (createdNew) {
                System.out.println("The file was successfully created.");
            } else {
                System.out.println("The file already exists.");

            }
        } catch (IOException e) {
            System.out.println("Cannot create the file: " + file.getPath());
            throw new RuntimeException(e);
        }
    }

    // tao thu muc
    private static void createDirectories() {
        File file = new File("src/File/FileClass/Test/NewFolder");
        boolean createdNewDirectory = file.mkdir();
        if (createdNewDirectory) {
            System.out.println("It was successfully created.");
        } else {
            System.out.println("It was not created.");
        }

    }

    // remove file and directories
    private static void removeFile() {
//        File file = new File("src/File/FileClass/Test/NewFolder");
        File file = new File("src/File/FileClass/Test/file.txt");
        if (file.delete()) {
            System.out.println("It was successfully removed.");
        } else {
            System.out.println("It was not removed.");
        }
    }

}
