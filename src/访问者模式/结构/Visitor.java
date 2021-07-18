package 访问者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 22:00
 * @desc 抽象访问者接口
 */
public interface Visitor {
    /**
     * 访问ConcreteElementA元素的方法
     *
     * @param element ConcreteElementA元素
     */
    public void visit(ConcreteElementA element);

    /**
     * 访问ConcreteElementB元素的方法
     *
     * @param element ConcreteElementB元素
     */
    public void visit(ConcreteElementB element);
}
