package hemant.code.Comparator.OldUsage;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<Student>();
        st.add(new Student(111, "bbbb", "london"));
        st.add(new Student(131, "aaaa", "nyc"));
        st.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for(int i=0;i<st.size();i++)
        {
            System.out.println(st.get(i));
        }


        Collections.sort(st, new Sortbyroll());
        System.out.println("Sorted by roll number");
        for (int i=0;i<st.size();i++)
        {
            System.out.println(st.get(i));
        }

        Collections.sort(st, new SortbyName());
        System.out.println("Sorted by Name");
        for(int i=0;i<st.size();i++)
        {
            System.out.println(st.get(i));
        }

    }
}
