package unit_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingExample {

    public static void main(String[] args) {
        System.out.println("File Handling Example");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/unit_1/test.txt");
            fos.write("Hello World".getBytes());
            System.out.println("Data written to file");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            fis = new FileInputStream("src/unit_1/test.txt");
            int k;
            while((k = fis.read()) != -1){
                System.out.print((char)k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
