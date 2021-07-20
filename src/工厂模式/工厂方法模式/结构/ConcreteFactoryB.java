package 工厂模式.工厂方法模式.结构;

/**
 * @author lcl100
 * @create 2021-07-20 22:39
 * @desc 具体工厂B，注意，B工厂只能创建B产品
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        // 创建具体产品B
        return new ConcreteProductB();
    }
}
