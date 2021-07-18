package 装饰者模式;

/**
 * @author lcl100
 * @create 2021-07-10 17:49
 * @desc 炒饭类，继承快餐类
 */
public class FriedRice extends FastFood {
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
