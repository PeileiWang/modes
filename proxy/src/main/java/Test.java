import oldclass.OldClass;
import proxy.Proxy;

/**
 * Created by wangpeilei
 * Time 2018/9/4 9:57
 */
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new OldClass());
        proxy.eat();
    }
}
