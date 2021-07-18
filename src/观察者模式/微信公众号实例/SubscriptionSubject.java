package 观察者模式.微信公众号实例;

import 外观模式.subsystem.SubSystemA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-07-17 10:30
 * @desc 具体主题类，微信公众号是具体主题（具体被观察者），里面存储了订阅该公众号的微信用户，并实现了抽象主题中的方法
 */
public class SubscriptionSubject implements Subject {
    // 存储了订阅了公众号的微信用户集合
    private List<Observer> weixinUserList=new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserList) {
            observer.update(message);
        }
    }
}
