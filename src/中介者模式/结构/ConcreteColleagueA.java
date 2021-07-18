package 中介者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 11:17
 * @desc 具体同事类
 */
public class ConcreteColleagueA extends AbstractColleague{
    @Override
    public void receive() {
        System.out.println("具体同事类A收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类A发出请求");
        mediator.relay(this);// 请中介者转发请求
    }
}
