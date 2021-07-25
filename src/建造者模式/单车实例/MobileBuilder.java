package 建造者模式.单车实例;

/**
 * @author lcl100
 * @create 2021-07-06 22:07
 * @desc 具体摩拜单车
 */
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
