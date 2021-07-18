package 装饰者模式;

/**
 * @author lcl100
 * @create 2021-07-10 17:46
 * @desc 快餐类，抽象类
 */
public abstract class FastFood {
    /**
     * 价格
     */
    private float price;
    /**
     * 描述
     */
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 抽象方法，计算快餐的价格
     *
     * @return 返回价格
     */
    public abstract float cost();
}
