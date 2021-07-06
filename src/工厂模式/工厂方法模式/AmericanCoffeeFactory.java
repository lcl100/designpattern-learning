package 工厂模式.工厂方法模式;

/**
 * @author lcl100
 * @create 2021-07-04 22:46
 * @desc 美式咖啡工厂类，生产美式咖啡
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        // 生产美式咖啡
        return new AmericanCoffee();
    }
}
