package 迭代器模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 21:08
 * @desc 迭代器接口
 */
public interface Iterator {
    /**
     * 获取第一个元素
     *
     * @return 返回第一个元素
     */
    Object first();

    /**
     * 获取下一个元素
     *
     * @return 返回下一个元素
     */
    Object next();

    /**
     * 判断是否有下一个元素
     *
     * @return 如果有则返回true，否则返回false
     */
    boolean hasNext();
}
