package hemant.code.Generics;

/**
 * Created by hemantkumar on 9/22/2017.
 * Java Program for Generic Class creation
 */

public class GenericEx1<T> {
    T t;
    public GenericEx1(T t)
    {
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
