package 中介者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 11:20
 * @desc 抽象中介者
 */
public abstract class AbstractMediator {
    // 让同事角色类注册到中介者
    public abstract void register(AbstractColleague colleague);

    // 转发其他同事角色类发出的请求
    public abstract void relay(AbstractColleague colleague);
}
