package 工厂模式.工厂方法模式.结构;

/**
 * @author lcl100
 * @create 2021-07-20 22:35
 * @desc 具体产品B，继承抽象产品类，实现里面定义的抽象方法
 */
public class ConcreteProductB extends Product {
    @Override
    public void show() {
        System.out.println("具体产品B...");
    }
}
