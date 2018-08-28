package protype;

import lombok.Data;

/**
 * Created by Wangpl
 * Time 2018/8/28 11:03
 */
@Data
public class Prototype implements Cloneable {

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setName("Wang");
        Prototype prototype1 = (Prototype) prototype.clone();
        System.out.println(prototype.toString() + "\t" + prototype1.toString());
        prototype1.setName("Li");
        System.out.println(prototype.toString() + "\t" + prototype1.toString());
    }
}
