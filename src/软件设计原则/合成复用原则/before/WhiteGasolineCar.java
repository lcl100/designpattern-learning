package 软件设计原则.合成复用原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 23:00
 * @desc 白色汽油汽车
 */
public class WhiteGasolineCar extends GasolineCar{
    @Override
    public void move() {
        System.out.println("白色汽油汽车");
    }
}
