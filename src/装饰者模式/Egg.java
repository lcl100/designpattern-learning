package 装饰者模式;

/**
 * @author lcl100
 * @create 2021-07-10 18:00
 * @desc 鸡蛋类（具体的装饰者角色）
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        // 计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        // 描述
        return super.getDesc() + getFastFood().getDesc();
    }
}
