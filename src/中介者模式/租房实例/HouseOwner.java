package 中介者模式.租房实例;

/**
 * @author lcl100
 * @create 2021-07-17 12:06
 * @desc 具体同事类，房主
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 与中介机构联系
    public void contact(String message) {
        mediator.contact(message, this);
    }

    // 房主获取消息
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息：" + message);
    }
}
