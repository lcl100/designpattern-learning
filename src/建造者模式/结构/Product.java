package 建造者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-24 11:44
 * @desc 产品角色，是一个复杂对象，里面包括组成该复杂对象的简单对象
 */
public class Product {
    // 组成产品的A部件
    private String partA;
    // 组件产品的B部件
    private String partB;
    // 组成产品的C部件
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        // 产品的行为方法，跟建造者、指挥者无关
        // 例如，展示该产品的特性
    }
}
