package 软件设计原则.接口隔离原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 21:10
 * @desc 太阳牌安全门，只能防盗、防火
 */
public class SunSafetyDoor implements AntiTheft, Fireproof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }
}
