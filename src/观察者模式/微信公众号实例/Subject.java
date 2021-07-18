package 观察者模式.微信公众号实例;

/**
 * @author lcl100
 * @create 2021-07-17 10:27
 * @desc 主题接口，定义了添加观察者、删除观察者、通知观察者的方法
 */
public interface Subject {
    // 添加观察者，即添加订阅用户
    public void attach(Observer observer);

    // 删除观察者，即删除订阅用户
    public void detach(Observer observer);

    // 通知观察者，即通知订阅者更新消息
    public void notify(String message);
}
