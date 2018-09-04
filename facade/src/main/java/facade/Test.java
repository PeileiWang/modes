package facade;

import facade.facade.Computer;

/**
 * Created by wangpeilei
 * Time 2018/9/4 10:35
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println("\n");
        computer.shutdown();
    }
}
