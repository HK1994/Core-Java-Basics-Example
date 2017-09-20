package hemant.code.fileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by hemantkumar on 9/20/2017.
 * Java Program to sort Single Column Text in a file
 */
public class SingleColumnTextSortingInAFile {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        try (FileReader fileReader = new FileReader("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\SingleColumn.txt");
             BufferedReader reader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\SingleColumnOutput.doc");
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            String currentLine = reader.readLine();
            while (currentLine != null) {
                wordList.add(currentLine);
                currentLine = reader.readLine();
            }
            Collections.sort(wordList);
            for (String line : wordList) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Successfully sorted Data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
