package singleton;

/**
 * Created by Wangpl
 * Time 2018/8/27 18:09
 */
public class Singleton1 {

    private String message;

    private Singleton1(){}

    private static Singleton1 singleton1 = null;

    public static synchronized Singleton1 getInstance() {
        if (singleton1 == null)
            singleton1 = new Singleton1();
        return singleton1;
    }
}
