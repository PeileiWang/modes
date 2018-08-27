package singleton.lazy.Singleton;

/**
 * 使用syncronized
 * Created by Wangpl
 * Time 2018/8/27 18:09
 */
public class Singleton1 {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Singleton1{" +
                "message='" + message + '\'' +
                '}';
    }

    private Singleton1(){}

    private static Singleton1 singleton1 = null;

    public static synchronized Singleton1 newInstance() {
        if (singleton1 == null)
            singleton1 = new Singleton1();
        return singleton1;
    }
}
