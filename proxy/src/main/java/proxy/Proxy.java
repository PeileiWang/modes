package proxy;

import interfaces.Source;
import oldclass.OldClass;

/**
 * Created by wangpeilei
 * Time 2018/9/4 9:55
 */
public class Proxy implements Source {

    @Override
    public void eat() {
        Source source = new OldClass();
        System.out.println("Before");
        source.eat();
        System.out.println("After");
        doSomethingElse();
    }

    private void doSomethingElse() {
        System.out.println("Something else");
    }

}
