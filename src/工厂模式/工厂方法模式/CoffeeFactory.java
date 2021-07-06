package 工厂模式.工厂方法模式;

/**
 * @author lcl100
 * @create 2021-07-04 22:44
 * @desc 咖啡工厂接口
 */
public interface CoffeeFactory {
    /**
     * 创建咖啡对象的方法
     *
     * @return 返回创建的咖啡对象
     */
    Coffee createCoffee();
}
