package 软件设计原则.接口隔离原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 21:11
 * @desc 星星牌安全门，只防火、防水
 */
public class StarSafetyDoor implements Fireproof,Waterproof{

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
