package hemant.code.Generics;

/**
 * Created by hemantkumar on 9/22/2017.
 * Consumin Class
 */
public class ClassUsingGenericEx1 {
    public static void main(String[] args) {
        GenericEx1<String> obj1 = new GenericEx1<String>("Alpha"); //Since we passed type as String so we won't be able to set other dt.
        GenericEx1<Integer> obj2 = new GenericEx1<>(123);
        GenericEx1<A> obj3 = new GenericEx1<>(new A(10)); // passing your own parameter
        obj1.setT("Beta");
        String str = obj1.getT();
        int num = obj2.getT();
        System.out.println(str);
        System.out.println(num);
        System.out.print(obj3.getT().i);

    }
}
