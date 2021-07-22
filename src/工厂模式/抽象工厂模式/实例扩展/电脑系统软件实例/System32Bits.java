package 工厂模式.抽象工厂模式.实例扩展.电脑系统软件实例;

/**
 * @author lcl100
 * @create 2021-07-22 22:58
 * @desc 具体产品类，32位的操作系统
 */
public class System32Bits extends OperatingSystem {
    @Override
    public void showBits() {
        System.out.println("32位的操作系统");
    }
}
