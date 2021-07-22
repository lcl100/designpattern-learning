package 工厂模式.抽象工厂模式.实例扩展.电脑系统软件实例;

/**
 * @author lcl100
 * @create 2021-07-22 23:07
 * @desc 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 创建生产64位电脑的电脑工厂
        ComputerFactory factory = new Computer64BitsFactory();
        // 生产电脑操作系统和电脑软件
        OperatingSystem system = factory.createSystem();
        Soft soft = factory.createSoft();
        // 调用方法
        system.showBits();
        soft.showBits();
    }
}
