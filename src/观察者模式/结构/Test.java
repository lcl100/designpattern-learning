package 观察者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 10:02
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 将观察者添加到主题中
        AbstractSubject subject = new ConcreteSubject();
        subject.add(new ConcreteObserverA());
        subject.add(new ConcreteObserverB());
        // 通知所有的观察者
        subject.notifyObserver();
    }
}
