package 建造者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-24 11:47
 * @desc 抽象建造者，包括创建产品各个子部件的抽象方法
 */
public abstract class Builder {
    // 创建产品对象
    protected Product product = new Product();

    /**
     * 建造产品的A部件
     */
    public abstract void buildPartA();

    /**
     * 建造产品的B部件
     */
    public abstract void buildPartB();

    /**
     * 建造产品的C部件
     */
    public abstract void buildPartC();

    /**
     * 返回产品对象
     *
     * @return 产品对象
     */
    public Product getResult() {
        return product;
    }
}
