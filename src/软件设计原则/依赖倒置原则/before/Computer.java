package 软件设计原则.依赖倒置原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 19:04
 * @desc 电脑类，组装硬盘、CPU和内存条
 */
public class Computer {
    private XiJieHardDisk hardDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("计算机工作");
        cpu.run();
        memory.save();
        String data = hardDisk.get();
        System.out.println("从硬盘中获取的数据为：" + data);
    }
}
