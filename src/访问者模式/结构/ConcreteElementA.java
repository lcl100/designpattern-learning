package 访问者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 22:11
 * @desc 具体元素A
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        // 让访问者对象来访问当前的具体元素A
        visitor.visit(this);
    }

    /**
     * 具体元素A会执行的操作
     * @return
     */
    public String operationA() {
        return "具体元素A的操作...";
    }
}
