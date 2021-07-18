package 装饰者模式;

/**
 * @author lcl100
 * @create 2021-07-10 17:52
 * @desc 炒面类，继承快餐类
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(15, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
