package File.FileClass;

/*
*  2 Phương pháp cơ bản để đọc file.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        String pathToFile = "src/File/FileClass/exampleFile.txt";
        // Reading data using Scanner
        File file = new File(pathToFile);

        // Khi sử dụng scanner để xử lí file thì cần handle
        // FileNotFoundException.
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.print(scanner.nextLine() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }


        String pathFileDataNumber = "src/File/FileClass/dataset_91033.txt";
        File fileData = new File(pathFileDataNumber);

        int sum = 0;
        try (Scanner scanner = new Scanner(fileData)) {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathFileDataNumber);
        }

        System.out.println(sum);


        // tính số chẵn trong file
        oldSum();

        checkMax();



    }

    public static void oldSum() {
        String pathFileDataNumber = "src/File/FileClass/dataset_91065.txt";
        File fileData = new File(pathFileDataNumber);

        int sum = 0;
        try (Scanner scanner = new Scanner(fileData)) {
            while (scanner.hasNext()) {
                int numberCheck = scanner.nextInt();
                if (numberCheck % 2 == 0) {
                    sum++;
                }
                if (numberCheck == 0) {
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathFileDataNumber);
        }

        System.out.println(sum);
    }


    private static void checkMax() {
        String pathFileDataNumber = "src/File/FileClass/dataset_91007.txt";
        File fileData = new File(pathFileDataNumber);

        int max = 0;
        try (Scanner scanner = new Scanner(fileData)) {
            while (scanner.hasNext()) {
                int a = scanner.nextInt();
                if (a > max) {
                    max = a;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathFileDataNumber);
        }

        System.out.println(max);
    }
}
