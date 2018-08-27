package singleton.lazy;

import singleton.lazy.Singleton.Singleton1;
import singleton.lazy.Singleton.Singleton2;
import singleton.lazy.Singleton.Singleton3;

/**
 * Created by Wangpl
 * Time 2018/8/27 20:03
 */
public class Test {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.newInstance();
        singleton1.setMessage("Singleton1");
        Singleton1 singleton11 = Singleton1.newInstance();
        System.out.println(singleton11.toString());

        Singleton2 singleton2 = Singleton2.newInstance();
        singleton2.setMessage("Singleton2");
        Singleton2 singleton21 = Singleton2.newInstance();
        System.out.println(singleton21.toString());

        Singleton3 singleton3 = Singleton3.newInstance();
        singleton3.setMessage("Singleton3");
        Singleton3 singleton31 = Singleton3.newInstance();
        System.out.println(singleton31.toString());
    }
}
