package 中介者模式.租房实例;

/**
 * @author lcl100
 * @create 2021-07-17 11:54
 * @desc 抽象中介者
 */
public abstract class Mediator {
    /**
     * 联系其他同事角色类的方法
     *
     * @param message 要发送的消息
     * @param person  要联系的人
     */
    public abstract void contact(String message, Person person);
}
