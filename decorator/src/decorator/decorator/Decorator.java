package decorator.decorator;

import decorator.component.Person;

/**
 * Created by wangpeilei
 * Time 2018/9/4 9:40
 */
public abstract class Decorator implements Person {

    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
