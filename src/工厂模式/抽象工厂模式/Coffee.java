package 工厂模式.抽象工厂模式;

/**
 * @author lcl100
 * @create 2021-07-04 21:21
 * @desc 咖啡抽象类
 */
public abstract class Coffee {
    /**
     * 咖啡名称，抽象方法，必须被实现
     *
     * @return 返回咖啡名称
     */
    public abstract String getName();

    /**
     * 加糖
     */
    public void addSugar() {
        System.out.println("加糖");
    }

    /**
     * 加奶
     */
    public void addMilk() {
        System.out.println("加奶");
    }
}
