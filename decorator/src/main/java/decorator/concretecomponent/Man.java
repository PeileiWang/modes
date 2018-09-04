package decorator.concretecomponent;

import decorator.component.Person;

/**
 * Created by wangpeilei
 * Time 2018/9/4 9:39
 */
public class Man implements Person {
    @Override
    public void eat() {
        System.out.println("A man is having launch");
    }
}
