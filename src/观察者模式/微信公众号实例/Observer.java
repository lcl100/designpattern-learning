package 观察者模式.微信公众号实例;

/**
 * @author lcl100
 * @create 2021-07-17 10:23
 * @desc 观察者接口
 */
public interface Observer {
    /**
     * 定义一个接收了微信公众号已经更新的方法
     *
     * @param message 更新的消息
     */
    public void update(String message);
}
