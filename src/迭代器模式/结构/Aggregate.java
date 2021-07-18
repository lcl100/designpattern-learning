package 迭代器模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 21:15
 * @desc 抽象聚合接口
 */
public interface Aggregate {
    /**
     * 添加元素
     *
     * @param obj 待添加的元素
     */
    public void add(Object obj);

    /**
     * 删除指定元素
     *
     * @param obj 待删除的元素
     */
    public void remove(Object obj);

    /**
     * 获取迭代器
     *
     * @return 返回迭代器
     */
    public Iterator getIterator();
}
