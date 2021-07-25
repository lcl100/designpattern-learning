package 建造者模式.单车实例;

/**
 * @author lcl100
 * @create 2021-07-06 22:04
 * @desc 建造者类
 */
public abstract class Builder {
    //声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    /**
     * 构建车架
     */
    public abstract void buildFrame();

    /**
     * 构建坐架
     */
    public abstract void buildSeat();

    /**
     * 创建单车
     * @return
     */
    public abstract Bike createBike();
}
