package hemant.code.fileHandling.MultiColumnSortingInFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by hemantkumar on 9/20/2017.
 * Java Code to Sort MultiColumn Data in a File
 */
public class MultiColumnSortingInFile {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\MultiColumnSortingInFile\\InputText.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("C:\\CoreJavaCodes\\src\\hemant\\code\\fileHandling\\MultiColumnSortingInFile\\OutputText.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String currentLine = bufferedReader.readLine();
            ArrayList<Student> studentResult = new ArrayList<>();
            while (currentLine != null) {
                String[] student = currentLine.split(" ");
                String name = student[0];
                int marks = Integer.parseInt(student[1]);
                studentResult.add(new Student(name, marks));
                currentLine = bufferedReader.readLine();
            }
            Collections.sort(studentResult,new MarksCompare());

            for (Student student: studentResult) {

                bufferedWriter.write(student.name);
                bufferedWriter.write(" " +student.marks);
                bufferedWriter.newLine();
            }
            System.out.println("Success");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
