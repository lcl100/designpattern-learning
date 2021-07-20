package 工厂模式.工厂方法模式.结构;

/**
 * @author lcl100
 * @create 2021-07-20 22:35
 * @desc 抽象工厂接口，定义了工厂创建产品的方法
 */
public interface Factory {
    /**
     * 工厂创建产品的方法
     *
     * @return 返回创建成功的产品
     */
    public Product createProduct();
}
