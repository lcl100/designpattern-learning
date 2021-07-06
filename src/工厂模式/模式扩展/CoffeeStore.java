package 工厂模式.模式扩展;

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
//        // 从简单咖啡工厂拿取生产的咖啡
//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
//        // 调用工厂的方法生产咖啡
//        Coffee coffee = factory.orderCoffee(type);
        Coffee coffee = SimpleCoffeeFactory.orderCoffee(type);// 静态工厂，添加了static关键字为创建对象的方法
        // 加配料
        coffee.addSugar();
        coffee.addMilk();
        // 返回
        return coffee;
    }
}
