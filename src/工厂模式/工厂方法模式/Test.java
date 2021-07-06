package 工厂模式.工厂方法模式;

/**
 * @author lcl100
 * @create 2021-07-04 22:52
 * @desc 测试类，测试咖啡店生产咖啡
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();

        // 2.生成美式咖啡
        // 2.1创建美式工厂类对象
        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        // 2.2为咖啡店设置工厂类
        coffeeStore.setCoffeeFactory(americanCoffeeFactory);
        // 2.3生成美式咖啡
        Coffee americanCoffee = coffeeStore.orderCoffee();
        // 2.4打印咖啡名称
        System.out.println(americanCoffee.getName());

        // 3.生成拿铁咖啡
        // 3.1创建拿铁工厂类对象
        LatteCoffeeFactory latteCoffeeFactory = new LatteCoffeeFactory();
        // 3.2为咖啡店设置工厂类
        coffeeStore.setCoffeeFactory(latteCoffeeFactory);
        // 3.3生成拿铁咖啡
        Coffee latteCoffee = coffeeStore.orderCoffee();
        // 3.4打印咖啡名称
        System.out.println(latteCoffee.getName());
    }
}
