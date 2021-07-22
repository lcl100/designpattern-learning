package 工厂模式.抽象工厂模式.实例扩展.电脑系统软件实例;

/**
 * @author lcl100
 * @create 2021-07-22 23:06
 * @desc 能运行在64位电脑系统上的软件
 */
public class Soft64Bits extends Soft {
    @Override
    public void showBits() {
        System.out.println("能运行在64位电脑系统上的软件");
    }
}
