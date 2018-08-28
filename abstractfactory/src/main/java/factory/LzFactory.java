package factory;

import domain.LzNoodles;
import interfaces.INoodles;
import interfaces.ProduceFactory;

/**
 * Created by Wangpl
 * Time 2018/8/27 18:03
 */
public class LzFactory implements ProduceFactory {
    public INoodles get() {
        return new LzNoodles();
    }
}
