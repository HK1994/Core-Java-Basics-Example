package hemant.code.fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by hemantkumar on 9/20/2017.
 * JAVA Program To Find The Most Repeated Word In Text File In Java.
 */
public class MostRepeatedWord {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        try (FileReader reader = new FileReader("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\CountData.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] wordCount = currentLine.toLowerCase().split(" ");
                for (String word : wordCount) {
                    if (wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }
                currentLine = bufferedReader.readLine();
            }

            String mostRepeatedWord = null;
            int mostRepeatedWordCount = 0;
            Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                if (entry.getValue() > mostRepeatedWordCount) {
                    mostRepeatedWord = entry.getKey();
                    mostRepeatedWordCount = entry.getValue();
                }
            }
            System.out.println("The most repeated word in input file is : " + mostRepeatedWord);
            System.out.println("Number Of Occurrences : " + mostRepeatedWordCount);
        }
    }
}

