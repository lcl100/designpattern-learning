package 工厂模式.抽象工厂模式;

/**
 * @author lcl100
 * @create 2021-07-05 23:40
 * @desc 意大利甜点工厂
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        // 返回意大利风味的拿铁咖啡
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        // 返回意大利风味的提拉米苏
        return new Tiramisu();
    }
}
