package 建造者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-24 11:54
 * @desc 指挥者，调用建造者中的方法完成复杂对象的创建，只与建造者Builder打交道
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指挥者指挥产品的构建与组装
     *
     * @return 返回组建成功的产品
     */
    public Product construct() {
        // 都是调用建造者Builder的方法完成
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
