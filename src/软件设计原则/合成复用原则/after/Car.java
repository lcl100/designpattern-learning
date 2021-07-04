package 软件设计原则.合成复用原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 23:16
 * @desc 汽车类
 */
public class Car {
    protected Color color;
    protected Power power;

    public Car(Color color, Power power) {
        this.color = color;
        this.power = power;
    }

    public void move() {
        System.out.println(color.getColor() + power.getPower() + "汽车");
    }
}
