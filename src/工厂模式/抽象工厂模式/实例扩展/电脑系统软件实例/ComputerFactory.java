package 工厂模式.抽象工厂模式.实例扩展.电脑系统软件实例;

/**
 * @author lcl100
 * @create 2021-07-22 22:28
 * @desc 抽象工厂接口，电脑工厂，定义了能够生产的产品族，如电脑操作系统、软件产品等
 */
public interface ComputerFactory {
    /**
     * 生产操作系统
     *
     * @return 返回生产成功的操作系统
     */
    public OperatingSystem createSystem();

    /**
     * 生产软件
     *
     * @return 返回生产成功的软件
     */
    public Soft createSoft();
}
