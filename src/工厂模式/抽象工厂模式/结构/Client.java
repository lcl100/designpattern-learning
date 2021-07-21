package 工厂模式.抽象工厂模式.结构;

/**
 * @author lcl100
 * @create 2021-07-21 23:08
 * @desc 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 创建能生产1产品族产品的工厂
        Factory factory = new ConcreteFactory1();
        // 生产产品A
        ProductA productA = factory.createProductA();
        productA.show();
        // 生产产品B
        ProductB productB = factory.createProductB();
        productB.show();
    }
}
