package 策略模式;

/**
 * @author lcl100
 * @create 2021-07-12 22:28
 * @desc 旅行者，环境类
 */
public class TravelMan {
    // 聚合策略对象
    private Strategy strategy;

    public TravelMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 出去旅行
    public void go() {
        strategy.travel();
    }
}
