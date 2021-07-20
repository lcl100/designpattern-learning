package 工厂模式.工厂方法模式.结构;

/**
 * @author lcl100
 * @create 2021-07-20 22:42
 * @desc 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 为了创建B产品，所以我们只需要创建B工厂
        Factory BFactory = new ConcreteFactoryB();
        // 利用B工厂创建B产品
        Product product = BFactory.createProduct();
        // 调用B工厂的方法
        product.show();
    }
}
