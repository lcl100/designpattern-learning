package 访问者模式.艺术公司与造币公司实例;

/**
 * @author lcl100
 * @create 2021-07-17 23:32
 * @desc 抽象元素接口，材料类
 */
public interface Material {
    /**
     * 给指定访问者提供访问当前元素（就是this）的方法
     *
     * @param visitor 指定的访问者
     * @return 访问当前元素返回的结果
     */
    String accept(Company visitor);
}
