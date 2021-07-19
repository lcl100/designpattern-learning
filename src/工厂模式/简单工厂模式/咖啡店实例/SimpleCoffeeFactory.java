package 工厂模式.简单工厂模式.咖啡店实例;

/**
 * @author lcl100
 * @create 2021-07-04 21:50
 * @desc 简单咖啡工厂类，生产咖啡
 */
public class SimpleCoffeeFactory {
    /**
     * 生成咖啡方法
     *
     * @param type 指定要生成的咖啡类型：美式咖啡american和拿铁咖啡latte
     * @return 返回生成完成的咖啡
     */
    public static Coffee orderCoffee(String type) {
        // 声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        // 根据type生产不同的咖啡
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，没有你所点的咖啡");
        }
        // 不需要加配料，加配料是咖啡店应该做的事情
        // 返回
        return coffee;
    }
}
