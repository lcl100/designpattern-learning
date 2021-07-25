package 建造者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-24 11:51
 * @desc 具体建造者，实现了抽象建造者接口
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        // 通过产品的set()方法来将建造完成的子部件设置到产品中
        product.setPartA("建造PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造PartC");
    }
}
