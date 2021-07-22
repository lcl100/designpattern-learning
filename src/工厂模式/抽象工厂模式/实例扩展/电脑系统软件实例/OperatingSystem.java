package 工厂模式.抽象工厂模式.实例扩展.电脑系统软件实例;

/**
 * @author lcl100
 * @create 2021-07-22 22:33
 * @desc 抽象产品类，电脑操作系统，系统架构分为64位和32位
 */
public abstract class OperatingSystem {
    /**
     * 展示电脑系统位数，该方法是属于System类的方法
     */
    public abstract void showBits();
}
