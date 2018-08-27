package factory;

import domain.GankouNoodles;
import interfaces.INoodles;
import interfaces.Produce;

/**
 * Created by Wangpl
 * Time 2018/8/27 18:03
 */
public class GankouFactory implements Produce {
    public INoodles get() {
        return new GankouNoodles();
    }
}
