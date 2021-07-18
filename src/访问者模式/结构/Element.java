package 访问者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 22:09
 * @desc 抽象元素接口
 */
public interface Element {
    /**
     * 能够接受访问者对象的方法
     *
     * @param visitor 访问者对象
     */
    public void accept(Visitor visitor);
}
