package 策略模式;

/**
 * @author lcl100
 * @create 2021-07-12 22:26
 * @desc 具体策略类，封装了算法，飞机出行
 */
public class StrategyC_Plane implements Strategy {

    @Override
    public void travel() {
        System.out.println("飞机出行");
    }
}
