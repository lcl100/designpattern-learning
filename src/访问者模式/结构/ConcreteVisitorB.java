package 访问者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 22:06
 * @desc 具体访问者B
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        // 具体访问者B访问ConcreteElementA元素会做的操作
        System.out.println("具体访问者B访问-->"+element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        // 具体访问者B访问ConcreteElementB元素会做的操作
        System.out.println("具体访问者B访问-->"+element.operationB());
    }
}
