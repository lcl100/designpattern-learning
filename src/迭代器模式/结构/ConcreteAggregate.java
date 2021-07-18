package 迭代器模式.结构;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-07-17 21:16
 * @desc 具体聚合
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        // 返回迭代器，将传入集合
        return new ConcreteIterator(list);
    }
}
