package 访问者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 22:14
 * @desc 具体元素B
 */
public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        // 让访问者对象来访问当前的具体元素B
        visitor.visit(this);
    }

    /**
     * 具体元素B会执行的操作
     * @return
     */
    public String operationB() {
        return "具体元素B的操作...";
    }
}
