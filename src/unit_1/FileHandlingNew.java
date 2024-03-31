package unit_1;

import java.io.FileWriter;

public class FileHandlingNew {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/unit_1/test.txt");
            fw.write("Hello World");
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
    }
}
