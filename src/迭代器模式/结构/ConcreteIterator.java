package 迭代器模式.结构;

import java.util.List;

/**
 * @author lcl100
 * @create 2021-07-17 21:10
 * @desc 具体迭代器
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = 0;// 集合中元素索引

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        return list.get(0);
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return list.get(index++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}
