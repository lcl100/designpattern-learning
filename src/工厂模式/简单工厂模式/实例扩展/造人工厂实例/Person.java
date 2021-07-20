package 工厂模式.简单工厂模式.实例扩展.造人工厂实例;

/**
 * @author lcl100
 * @create 2021-07-20 20:40
 * @desc 抽象产品接口，人
 */
public interface Person {
    /**
     * 可以获取当前人的类型
     *
     * @return 返回人的类型
     */
    public abstract String getType();
}
