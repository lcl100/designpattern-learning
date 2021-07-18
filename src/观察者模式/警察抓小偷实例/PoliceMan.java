package 观察者模式.警察抓小偷实例;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lcl100
 * @create 2021-07-17 10:52
 * @desc 警察类，是观察者，实现Observer接口
 */
public class PoliceMan implements Observer {
    // 警察的名字
    private String name;

    public PoliceMan(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("警察：" + ((Thief) o).getName() + ", 我已经盯你很久了。");
    }
}
