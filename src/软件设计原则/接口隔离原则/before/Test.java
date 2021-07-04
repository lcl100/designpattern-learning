package 软件设计原则.接口隔离原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 20:37
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        SafetyDoor safetyDoor=new MoonSafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.fireproof();
        safetyDoor.waterproof();
    }
}
