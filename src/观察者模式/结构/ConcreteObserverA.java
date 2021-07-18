package 观察者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 9:55
 * @desc 具体观察者
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void response() {
        System.out.println("观察者A做出的响应");
    }
}
