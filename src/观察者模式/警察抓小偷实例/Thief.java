package 观察者模式.警察抓小偷实例;

import java.util.Observable;

/**
 * @author lcl100
 * @create 2021-07-17 10:47
 * @desc 小偷类，小偷是一个被观察者，也就是具体主题类，继承抽象主题类Observable
 */
public class Thief extends Observable {
    String name;

    public Thief(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void steal() {
        System.out.println("小偷：我偷东西了，有没有人来抓我呀！！！");
        super.setChanged();// 表明目标对象发生了变化
        super.notifyObservers();// 通知所有的观察者，即通知警察
    }
}
