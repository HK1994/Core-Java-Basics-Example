package hemant.code.fileHandling;

import java.io.*;

/**
 * Created by hemantkumar on 9/19/2017.
 * Java program to append text to a File in Java using FileWriter
 */
public class AppendTextToFile {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\CountData.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
            printWriter.println();
            printWriter.println("Testing the append file1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
