package singleton.hungry;

import singleton.hungry.Singleton.Singleton;

/**
 * Created by Wangpl
 * Time 2018/8/27 23:14
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.newInstance();
        singleton.setMessage("Hungry Singleton");
        Singleton singleton1 = Singleton.newInstance();
        System.out.println(singleton1.toString());
    }
}
