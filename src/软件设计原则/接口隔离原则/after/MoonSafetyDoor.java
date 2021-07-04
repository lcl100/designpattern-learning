package 软件设计原则.接口隔离原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 20:46
 * @desc 月亮牌安全类，实现了SafetyDoor接口
 */
public class MoonSafetyDoor implements AntiTheft, Fireproof, Waterproof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
