package 工厂模式.抽象工厂模式.实例扩展.电脑系统软件实例;

/**
 * @author lcl100
 * @create 2021-07-22 22:32
 * @desc 抽象产品类，电脑软件，由于电脑系统架构的不同，所以也分为能在32位系统上运行的软件和64位系统上运行的软件
 */
public abstract class Soft {
    /**
     * 展示软件位数，注意，两个抽象产品类中的方法不必一样，这里仅是演示
     */
    public abstract void showBits();
}
