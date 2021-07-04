package 软件设计原则.接口隔离原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 20:37
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 月亮牌安全门
        MoonSafetyDoor moonSafetyDoor = new MoonSafetyDoor();
        moonSafetyDoor.antiTheft();
        moonSafetyDoor.fireproof();
        moonSafetyDoor.waterproof();

        System.out.println("==============================");

        // 太阳牌安全门
        SunSafetyDoor sunSafetyDoor = new SunSafetyDoor();
        sunSafetyDoor.antiTheft();
        sunSafetyDoor.fireproof();

        System.out.println("==============================");

        // 星星牌安全门
        StarSafetyDoor starSafetyDoor = new StarSafetyDoor();
        starSafetyDoor.fireproof();
        starSafetyDoor.waterproof();
    }
}
