package 迭代器模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 21:18
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        Aggregate ag=new ConcreteAggregate();
        ag.add("张三");
        ag.add("李四");
        ag.add("王五");

        // 使用迭代器遍历聚合对象
        Iterator iterator = ag.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
