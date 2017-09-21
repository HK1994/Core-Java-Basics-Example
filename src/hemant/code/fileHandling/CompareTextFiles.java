package hemant.code.fileHandling;

import java.io.*;
/**
 * Created by hemantkumar on 9/20/2017.
 * Java Program to compare two text files.
 */
public class CompareTextFiles {
    public static void main(String[] args) {
        try (FileReader reader1 = new FileReader("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\TextFile1.txt ");
             BufferedReader bufferedReader1 = new BufferedReader(reader1);
             FileReader reader2 = new FileReader("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\TextFile2.txt ");
             BufferedReader bufferedReader2 = new BufferedReader(reader2);) {
            String line1 = bufferedReader1.readLine();
            String line2 = bufferedReader2.readLine();
            int lineNum = 1;
            boolean textEquals = true;
            while (line1 != null || line2 != null) {
                if (line1 == null || line2 == null) {
                    textEquals = false;
                    break;
                } else if (!(line1.equalsIgnoreCase(line2))) {
                    textEquals = false;
                    break;
                }
                line1 = bufferedReader1.readLine();
                line2 = bufferedReader2.readLine();
                lineNum++;
            }
            if (textEquals) {
                System.out.println("Both files have same content");
            } else {
                System.out.println("Two files have different content. They differ at line " + lineNum);
                System.out.println("File1 has " + line1 + " and File2 has " + line2 + " at line " + lineNum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
