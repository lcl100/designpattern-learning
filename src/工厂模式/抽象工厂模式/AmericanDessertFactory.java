package 工厂模式.抽象工厂模式;

/**
 * @author lcl100
 * @create 2021-07-05 23:42
 * @desc 美式风味甜点工厂
 */
public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        // 生产美式风味的咖啡
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        // 生产美式风味的抹茶慕斯
        return new MatchaMousse();
    }
}
