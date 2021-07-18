package 访问者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 22:24
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象结构类的对象
        ObjectStructure os=new ObjectStructure();
        os.add(new ConcreteElementA());// 向集合中添加具体元素对象
        os.add(new ConcreteElementB());// 向集合中添加具体元素对象

        // 创建具体访问者A，让该访问者来访问对象结构中的所有元素
        Visitor visitorA=new ConcreteVisitorA();
        os.accept(visitorA);

        System.out.println("==============================");

        // 创建具体访问者B，让该访问者来访问对象结构中的所有元素
        Visitor visitorB=new ConcreteVisitorB();
        os.accept(visitorB);
    }
}
