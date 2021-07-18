package 中介者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 11:27
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 中介者中心
        AbstractMediator mediator = new ConcreteMediator();
        // 创建同事类
        AbstractColleague c1 = new ConcreteColleagueA();
        AbstractColleague c2 = new ConcreteColleagueB();
        // 将同事类注册到中介者中
        mediator.register(c1);
        mediator.register(c2);
        // 让同事类A发出请求，那么其他的同事类也能收到该请求
        c1.send();
        System.out.println("==================================");
        // 让同事类B发出请求，那么其他的同事类也能收到该请求
        c2.send();
    }
}
