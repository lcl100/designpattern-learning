package 工厂模式.工厂方法模式.结构;

/**
 * @author lcl100
 * @create 2021-07-20 22:34
 * @desc 具体产品A，实现抽象产品类中的方法
 */
public class ConcreteProductA extends Product {
    @Override
    public void show() {
        System.out.println("具体产品A...");
    }
}
