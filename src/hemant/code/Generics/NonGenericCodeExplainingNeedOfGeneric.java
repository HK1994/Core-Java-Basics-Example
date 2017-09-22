package hemant.code.Generics;

import java.util.ArrayList;

/**
 * Created by hemantkumar on 9/22/2017.
 * ClassCastExceptionExample
 */
public class NonGenericCodeExplainingNeedOfGeneric {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("Alpha");
        list.add(123);

        for (Object object: list) {

            String str = (String)object;  // Here we will have typecasting error.--> Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
            System.out.print(str);
        }
    }

}

