package 观察者模式.微信公众号实例;

/**
 * @author lcl100
 * @create 2021-07-17 10:25
 * @desc 具体观察者，微信用户类
 */
public class WeixinUser implements Observer {
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
