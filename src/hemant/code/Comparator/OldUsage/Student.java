package hemant.code.Comparator.OldUsage;

/**
 * Created by hemantkumar on 11/14/2017.
 */
public class Student {
    int rollNum;
    String name;
    String address;

    public Student(int roll, String name,String address)
    {
        this.rollNum = roll;
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return this.rollNum + " " + this.name + " " +this.address;
    }

}
