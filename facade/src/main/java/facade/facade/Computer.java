package facade.facade;

import facade.children.CPU;
import facade.children.Disk;
import facade.children.Memory;

/**
 * Created by wangpeilei
 * Time 2018/9/4 10:29
 */
public class Computer {

    private CPU cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start() {
        System.out.println("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer start end");
    }

    public void shutdown() {
        System.out.println("Computer shutdown begin");
        memory.shutdown();
        disk.shutdown();
        cpu.shutdown();
        System.out.println("Computer shutdown end");
    }
}
