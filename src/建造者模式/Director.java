package 建造者模式;

/**
 * @author lcl100
 * @create 2021-07-06 22:12
 * @desc 指挥者
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装单车的功能
     *
     * @return 返回组装成功的单车对象
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
