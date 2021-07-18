package 装饰者模式;

/**
 * @author lcl100
 * @create 2021-07-10 18:04
 * @desc 培根类（具体的装饰者角色）
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
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
