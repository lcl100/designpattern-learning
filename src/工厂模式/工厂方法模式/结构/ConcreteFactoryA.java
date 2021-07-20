package 工厂模式.工厂方法模式.结构;

/**
 * @author lcl100
 * @create 2021-07-20 22:37
 * @desc 具体工厂A，注意，A工厂只生产A产品，而不会生产B产品
 */
public class ConcreteFactoryA implements Factory {

    @Override
    public Product createProduct() {
        // 创建具体A产品
        return new ConcreteProductA();
    }
}
