package 工厂模式.工厂方法模式.咖啡店实例;

/**
 * @author lcl100
 * @create 2021-07-04 22:49
 * @desc 咖啡店类，售卖咖啡
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.factory = coffeeFactory;
    }

    /**
     * 点咖啡
     * @return
     */
    public Coffee orderCoffee(){
        // 通过工厂生产咖啡
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        // 返回
        return coffee;
    }
}
