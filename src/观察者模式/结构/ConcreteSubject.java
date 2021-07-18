package 观察者模式.结构;

/**
 * @author lcl100
 * @create 2021-07-17 10:00
 * @desc 具体目标类
 */
public class ConcreteSubject extends AbstractSubject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标类发送改变了...");
        // 循环遍历所有的观察者，通知它们
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
