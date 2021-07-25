package 建造者模式.单车实例;

/**
 * @author lcl100
 * @create 2021-07-06 22:10
 * @desc 具体OFO单车
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
