package proxy;

import interfaces.Source;

/**
 * Created by wangpeilei
 * Time 2018/9/4 9:55
 */
public class Proxy implements Source {

    private Source source;

    public Proxy() {}

    public Proxy(Source source) {
        this.source = source;
    }

    @Override
    public void eat() {
        System.out.println("Before");
        source.eat();
        System.out.println("After");
        doSomethingElse();
    }

    private void doSomethingElse() {
        System.out.println("Something else");
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
