package 观察者模式.结构;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-07-17 9:56
 * @desc 抽象主题类
 */
public abstract class AbstractSubject {
    // 用来保存观察者的集合
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer 观察者对象
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer 观察者对象
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者的方法，由具体目标类实现
     */
    public abstract void notifyObserver();
}
