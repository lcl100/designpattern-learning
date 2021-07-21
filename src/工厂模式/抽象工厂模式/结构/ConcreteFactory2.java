package 工厂模式.抽象工厂模式.结构;

/**
 * @author lcl100
 * @create 2021-07-21 22:59
 * @desc 具体工厂2，用来生产该工厂能提供的产品族产品，例如苹果工厂
 */
public class ConcreteFactory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
