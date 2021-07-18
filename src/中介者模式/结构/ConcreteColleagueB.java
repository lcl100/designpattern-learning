package 中介者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 11:18
 * @desc 具体同事类
 */
public class ConcreteColleagueB extends AbstractColleague{
    @Override
    public void receive() {
        System.out.println("具体同事类B收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类B发出请求");
        mediator.relay(this);// 请中介者转发
    }
}
