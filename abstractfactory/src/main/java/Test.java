import factory.GankouFactory;
import interfaces.INoodles;
import interfaces.ProduceFactory;

/**
 * Created by Wangpl
 * Time 2018/8/27 18:05
 */
public class Test {

    public static void main(String[] args) {
        ProduceFactory produce = new GankouFactory();
        INoodles noodles = produce.get();
        noodles.description();
    }
}
