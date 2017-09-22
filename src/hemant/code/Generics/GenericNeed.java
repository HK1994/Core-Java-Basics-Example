package hemant.code.Generics;

import java.util.ArrayList;

/**
 * Created by hemantkumar on 9/22/2017.
 * Previous code --handle ClassCastException using Generics
 */
public class GenericNeed {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Alpha");
//       list.add(123);  not possible as java performs type checking so can only add String Object
        list.add("Beta");

        for (String str:list) {
                System.out.print(str);
        }
    }
}

