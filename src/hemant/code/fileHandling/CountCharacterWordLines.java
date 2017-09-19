package hemant.code.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by hemantkumar on 9/19/2017.
 * JAVA PROGRAM To Find Number Of Characters, Words And Lines In File
 */
public class CountCharacterWordLines {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = null;

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try{
            bufferedReader = new BufferedReader(new FileReader("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\CountData.txt"));

            String currentLine = bufferedReader.readLine();
            while(currentLine!=null)
            {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount+ words.length;

                for (String word:words)
                {
                    charCount = charCount+word.length();
                }

                currentLine = bufferedReader.readLine();
            }

            System.out.println("Number of Lines in the File = " +lineCount);
            System.out.println("Number of Words in the File = " +wordCount);
            System.out.println("Number of Characters in the File = " +charCount);


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        finally {
            {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
