package 工厂模式.抽象工厂模式.结构;

/**
 * @author lcl100
 * @create 2021-07-21 22:49
 * @desc 抽象工厂接口，可以用来生产同一产品族不同等级的产品，例如生产电脑的CPU配件、内存条配件等
 */
public interface Factory {
    /**
     * 创建产品族中的A产品，例如电脑的CPU配件
     *
     * @return 返回值是A产品的抽象类，即创建成功的A产品
     */
    public ProductA createProductA();

    /**
     * 创建产品族中的B产品，例如电脑的内存条配件
     *
     * @return 返回值是B产品的抽象类，即创建成功的B产品
     */
    public ProductB createProductB();
}
