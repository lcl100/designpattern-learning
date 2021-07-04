package 软件设计原则.合成复用原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 23:02
 * @desc 黑色电动汽车
 */
public class BlackElectricCar extends ElectricCar{
    @Override
    public void move() {
        System.out.println("黑色电动汽车");
    }
}
