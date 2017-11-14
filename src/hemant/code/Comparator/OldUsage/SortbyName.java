package hemant.code.Comparator.OldUsage;

import java.util.Comparator;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class SortbyName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}
