package 工厂模式.简单工厂模式.咖啡店实例;

/**
 * @author lcl100
 * @create 2021-07-04 21:29
 * @desc 测试类，测试咖啡店生产咖啡的方法
 */
public class Test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        // 生产美式咖啡
        Coffee americanCoffee = coffeeStore.orderCoffee("american");
        System.out.println(americanCoffee.getName());
        // 生产拿铁咖啡
        Coffee latteCoffee = coffeeStore.orderCoffee("latte");
        System.out.println(latteCoffee.getName());
    }
}
