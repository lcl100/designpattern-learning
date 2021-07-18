package 访问者模式.结构;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-07-17 22:17
 * @desc 对象结构
 */
public class ObjectStructure {
    /**
     * 用来存储元素的集合
     */
    private List<Element> list = new ArrayList<>();

    /**
     * 让指定的访问者对象访问list集合中的所有元素
     *
     * @param visitor 指定的访问者对象
     */
    public void accept(Visitor visitor) {
        // 获取List集合的迭代器
        Iterator<Element> iterator = list.iterator();
        // 循环遍历集合，让访问者对象来访问集合中的所有元素，不仅仅是一个元素
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    /**
     * 向集合中添加元素
     *
     * @param element 待添加的元素
     */
    public void add(Element element) {
        list.add(element);
    }

    /**
     * 删除集合中的指定元素
     *
     * @param element 待删除的元素
     */
    public void remove(Element element) {
        list.remove(element);
    }
}
