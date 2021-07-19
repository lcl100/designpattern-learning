package 工厂模式.简单工厂模式.结构;

/**
 * @author lcl100
 * @create 2021-07-19 22:04
 * @desc 测试类，对简单工厂制造产品的方法进行测试
 */
public class Client {
    public static void main(String[] args) {
        // 第一步，调用工厂方法创建产品，不需要创建工厂，因为是静态方法，可以直接通过类名调用方法
        Product product = SimpleFactory.makeProduct("A");// 传入参数A，表示创建A产品
        // 第二步，调用产品的方法
        product.show();
    }
}
