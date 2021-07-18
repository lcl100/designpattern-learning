package 观察者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 9:56
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("观察者B做出的响应");
    }
}
