package 软件设计原则.合成复用原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 23:17
 * @desc 汽车动力源
 */
public class Power {
    String power;

    public Power(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
