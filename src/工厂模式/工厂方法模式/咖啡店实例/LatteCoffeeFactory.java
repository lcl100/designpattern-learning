package 工厂模式.工厂方法模式.咖啡店实例;

/**
 * @author lcl100
 * @create 2021-07-04 22:47
 * @desc 拿铁咖啡工厂类，用来生产拿铁咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        // 生产拿铁咖啡
        return new LatteCoffee();
    }
}
