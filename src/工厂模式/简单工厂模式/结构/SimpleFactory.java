package 工厂模式.简单工厂模式.结构;

/**
 * @author lcl100
 * @create 2021-07-19 21:12
 * @desc 简单工厂类
 */
public class SimpleFactory {
    /**
     * 简单工厂类中创建产品的方法
     *
     * @param name 传入的参数，用来区分创建不同的产品
     * @return 返回创建成功的产品
     */
    public static Product makeProduct(String name) {
        // 为了能够判断创建不同的产品，通常可以选择用if或者switch来实现
        switch (name) {
            case "A":// 如果传入的是'A'，那么则创建A产品
                return new ConcreteProductA();
            case "B":// 如果传入的是'B'，那么则创建B产品
                return new ConcreteProductB();
            default:// 如果传入其他字符，那么则返回null，表示没有符合的产品
                return null;
        }
    }
}
