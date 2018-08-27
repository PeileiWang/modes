import factory.NoodleFactory;
import interfaces.INoodles;

/**
 * Created by Wangpl
 * Time 2018/8/27 17:53
 */
public class Test {
    public static void main(String[] args) {
        INoodles noodles = NoodleFactory.createNoodles(NoodleFactory.TYPE_GK);
        noodles.description();
    }
}
