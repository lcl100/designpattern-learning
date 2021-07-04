package 软件设计原则.合成复用原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 22:59
 * @desc 汽油汽车
 */
public class GasolineCar extends Car{
    @Override
    public void move() {
        System.out.println("汽油汽车移动");
    }
}
