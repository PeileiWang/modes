package decorator.concretedecorator;

import decorator.decorator.Decorator;

/**
 * Created by wangpeilei
 * Time 2018/9/4 9:42
 */
public class ManDecorator extends Decorator {
    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecorator");
    }

    private void reEat() {
        System.out.println("having supper");
    }
}
