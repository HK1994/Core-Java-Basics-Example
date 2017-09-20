package hemant.code.fileHandling.MultiColumnSortingInFile;

import java.util.Comparator;

/**
 * Created by hemantkumar on 9/20/2017.
 */
public class MarksCompare implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2)
    {
        return s2.marks - s1.marks;
    }


}
