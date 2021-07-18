package 观察者模式.微信公众号实例;

/**
 * @author lcl100
 * @create 2021-07-17 10:35
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建主题
        Subject subject = new SubscriptionSubject();
        // 创建微信用户
        WeixinUser user1 = new WeixinUser("张三");
        WeixinUser user2 = new WeixinUser("李四");
        WeixinUser user3 = new WeixinUser("王五");
        // 订阅公众号
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);
        // 公众号更新发出消息给订阅的微信用户
        subject.notify("Java设计模式专栏更新了");
    }
}
