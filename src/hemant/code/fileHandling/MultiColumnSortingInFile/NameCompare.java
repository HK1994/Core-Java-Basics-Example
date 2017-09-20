package hemant.code.fileHandling.MultiColumnSortingInFile;

import java.util.Comparator;

/**
 * Created by hemantkumar on 9/20/2017.
 */
 class NameCompare implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
