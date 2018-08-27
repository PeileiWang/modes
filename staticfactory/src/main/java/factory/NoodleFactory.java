package factory;

import domain.GankouNoodles;
import domain.LzNoodles;
import domain.PaoNoodles;
import interfaces.INoodles;

/**
 * Created by Wangpl
 * Time 2018/8/27 17:49
 */
public class NoodleFactory {
    public static final int TYPE_LZ = 1;    //兰州拉面
    public static final int TYPE_PM = 2;    //泡面
    public static final int TYPE_GK = 3;    //干扣面

    public static INoodles createNoodles(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();
            case TYPE_PM:
                return new PaoNoodles();
            default:
                return new GankouNoodles();
        }
    }
}
