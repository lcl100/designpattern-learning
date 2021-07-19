package 工厂模式.简单工厂模式.结构;

/**
 * @author lcl100
 * @create 2021-07-19 21:09
 * @desc 具体产品类A，实现Product接口
 */
public class ConcreteProductA implements Product {
    @Override
    public void show() {
        // 实现抽象产品类中的方法
        System.out.println("具体A产品...");
    }
}
