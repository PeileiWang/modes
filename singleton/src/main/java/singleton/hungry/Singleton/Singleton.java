package singleton.hungry.Singleton;

/**
 * Created by Wangpl
 * Time 2018/8/27 20:42
 */
public class Singleton {

    private String message;

    @Override
    public String toString() {
        return "Singleton{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Singleton(){}

    private static Singleton singleton = new Singleton();

    public static Singleton newInstance() {
        return singleton;
    }

}
