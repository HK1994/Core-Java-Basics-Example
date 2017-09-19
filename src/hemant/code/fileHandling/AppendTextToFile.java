package hemant.code.fileHandling;

import java.io.*;

/**
 * Created by hemantkumar on 9/19/2017.
 * Java program to append text to a File in Java using FileWriter
 */
public class AppendTextToFile {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\CountData.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            printWriter.println();
            printWriter.println("Testing the append file1");

        }
        catch (IOException e)
        {
                e.printStackTrace();
        }
        finally {
            try{
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
