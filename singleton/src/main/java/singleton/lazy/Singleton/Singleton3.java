package singleton.lazy.Singleton;

/**
 * Created by Wangpl
 * Time 2018/8/27 20:01
 */
public class Singleton3 {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "message='" + message + '\'' +
                '}';
    }

    private Singleton3() {}

    private static class LazyHolder {
        private static Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 newInstance() {
        return LazyHolder.INSTANCE;
    }
}
