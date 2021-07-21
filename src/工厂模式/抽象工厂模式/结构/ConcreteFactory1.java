package 工厂模式.抽象工厂模式.结构;

/**
 * @author lcl100
 * @create 2021-07-21 22:57
 * @desc 具体工厂1，用来生产该工厂能提供的产品族产品，例如联想工厂
 */
public class ConcreteFactory1 implements Factory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
