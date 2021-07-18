package 中介者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 11:14
 * @desc 抽象同事类
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    // 向其他同事角色发出请求
    public abstract void receive();

    // 接收其他同事角色的请求
    public abstract void send();
}
