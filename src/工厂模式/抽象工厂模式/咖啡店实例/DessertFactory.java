package 工厂模式.抽象工厂模式.咖啡店实例;

/**
 * @author lcl100
 * @create 2021-07-05 23:39
 * @desc 甜点工厂接口
 */
public interface DessertFactory {
    /**
     * 生产咖啡
     *
     * @return
     */
    Coffee createCoffee();

    /**
     * 生产甜点
     *
     * @return
     */
    Dessert createDessert();
}
