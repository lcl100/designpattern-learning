package 工厂模式.问题引入;

/**
 * @author lcl100
 * @create 2021-07-04 21:25
 * @desc 咖啡店类
 */
public class CoffeeStore {

    /**
     * 生成咖啡方法
     *
     * @param type 指定要生成的咖啡类型：美式咖啡american和拿铁咖啡latte
     * @return 返回生成完成的咖啡
     */
    public Coffee orderCoffee(String type) {
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
        // 加配料
        coffee.addSugar();
        coffee.addMilk();
        // 返回
        return coffee;
    }
}
