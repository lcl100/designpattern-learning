package 装饰者模式;

/**
 * @author lcl100
 * @create 2021-07-10 17:34
 * @desc 装饰者类（抽象装饰者角色），继承快餐类
 */
public abstract class Garnish extends FastFood {
    /**
     * 再定义一个快餐类成员变量
     */
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
