package factory;

import domain.PaoNoodles;
import interfaces.INoodles;
import interfaces.Produce;

/**
 * Created by Wangpl
 * Time 2018/8/27 18:04
 */
public class PaoFactory implements Produce {
    public INoodles get() {
        return new PaoNoodles();
    }
}
