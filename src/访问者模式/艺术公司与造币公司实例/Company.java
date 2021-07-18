package 访问者模式.艺术公司与造币公司实例;

/**
 * @author lcl100
 * @create 2021-07-17 23:15
 * @desc 抽象访问者接口，公司
 */
public interface Company {
    /**
     * 操作Page元素
     * @param element
     * @return
     */
    String create(Paper element);

    /**
     * 操作Cuprum元素
     * @param element
     * @return
     */
    String create(Cuprum element);
}
