package unit_1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileHandlingNew {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/unit_1/test.txt");
            fw.write("Welcome to New File Handling Using Java");
            System.out.println("Data written to file");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
                }
        }
        FileReader fr = null;
        try {
            fr = new FileReader("src/unit_1/test.txt");
            int k;
            while((k = fr.read()) != -1){
                System.out.print((char)k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
