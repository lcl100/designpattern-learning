package 策略模式;

/**
 * @author lcl100
 * @create 2021-07-12 22:31
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 选择自行车出行
        TravelMan tm1=new TravelMan(new StrategyA_Bike());
        tm1.go();

        // 选择汽车出行
        TravelMan tm2=new TravelMan(new StrategyB_Car());
        tm2.go();

        // 选择飞机出行
        TravelMan tm3=new TravelMan(new StrategyC_Plane());
        tm3.go();
    }
}
