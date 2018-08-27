package singleton.lazy.Singleton;

/**
 * 双重检查锁定
 * Created by Wangpl
 * Time 2018/8/27 19:48
 */
public class Singleton2 {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Singleton2{" +
                "message='" + message + '\'' +
                '}';
    }

    private static Singleton2 singleton2 = null;

    private Singleton2(){}

    public static Singleton2 newInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null)
                    singleton2 = new Singleton2();
            }
        }
        return  singleton2;
    }
}
