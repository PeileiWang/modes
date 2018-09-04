package decorator;

import decorator.concretecomponent.Man;
import decorator.concretedecorator.ManDecorator;

/**
 * Created by wangpeilei
 * Time 2018/9/4 9:44
 */
public class Test {
    public static void main(String[] args) {
        ManDecorator decorator = new ManDecorator();
        decorator.setPerson(new Man());

        decorator.eat();
    }
}
