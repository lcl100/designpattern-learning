package 建造者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-24 11:58
 * @desc 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 创建建造者
        Builder builder = new ConcreteBuilder();
        // 创建指挥者
        Director director = new Director(builder);
        // 通过指挥者来创建产品
        Product product = director.construct();
        // 查看产品的特性，即调用产品独有的方法
        product.show();
    }
}
