package 软件设计原则.依赖倒置原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 19:05
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建电脑类
        Computer computer = new Computer();
        // 2.设置硬盘、CPU和内存条参数
        // 2.1设置硬盘
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        computer.setHardDisk(hardDisk);
        // 2.2设置CPU
        IntelCpu cpu = new IntelCpu();
        computer.setCpu(cpu);
        // 2.3设置内存条
        KingstonMemory memory = new KingstonMemory();
        computer.setMemory(memory);
        // 3.启动电脑
        computer.run();
    }
}
