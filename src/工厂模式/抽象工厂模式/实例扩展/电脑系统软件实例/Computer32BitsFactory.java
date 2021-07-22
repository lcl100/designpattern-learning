package 工厂模式.抽象工厂模式.实例扩展.电脑系统软件实例;

/**
 * @author lcl100
 * @create 2021-07-22 22:35
 * @desc 具体工厂，生产32位系统架构的电脑和32位系统架构的电脑
 */
public class Computer32BitsFactory implements ComputerFactory {

    @Override
    public OperatingSystem createSystem() {
        // 生产32位的电脑系统
        return new System32Bits();
    }

    @Override
    public Soft createSoft() {
        // 生产32位的电脑软件
        return new Soft32Bits();
    }
}
