package 策略模式;

/**
 * @author lcl100
 * @create 2021-07-12 22:24
 * @desc 具体策略类，封装了算法，自行车出行
 */
public class StrategyA_Bike implements Strategy{

    @Override
    public void travel() {
        System.out.println("自行车出行");
    }
}
