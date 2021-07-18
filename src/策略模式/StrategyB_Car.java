package 策略模式;

/**
 * @author lcl100
 * @create 2021-07-12 22:25
 * @desc 具体策略类，封装了算法，汽车出行
 */
public class StrategyB_Car implements Strategy{
    @Override
    public void travel() {
        System.out.println("汽车出行");
    }
}
