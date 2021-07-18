package 访问者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 22:03
 * @desc 具体访问者A
 */
public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(ConcreteElementA element) {
        // 具体访问者A访问ConcreteElementA元素会做的操作
        System.out.println("具体访问者A访问-->"+element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        // 具体访问者A访问ConcreteElementB元素会做的操作
        System.out.println("具体访问者A访问-->"+element.operationB());
    }
}
