package factory;

import domain.LzNoodles;
import interfaces.INoodles;
import interfaces.Produce;

/**
 * Created by Wangpl
 * Time 2018/8/27 18:03
 */
public class LzFactory implements Produce {
    public INoodles get() {
        return new LzNoodles();
    }
}
