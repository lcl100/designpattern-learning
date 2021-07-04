package 软件设计原则.合成复用原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 22:59
 * @desc 电动汽车
 */
public class ElectricCar extends Car{
    @Override
    public void move() {
        System.out.println("电动汽车移动");
    }
}
