package 软件设计原则.里氏替换原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 16:27
 * @desc 企鹅类，也属于鸟类，所以继承鸟类的一些行为和方法
 */
public class Penguin extends Bird {
    @Override
    public void setFlySpeed(double flySpeed) {
        // 因为企鹅是不会飞的，所以如果设定了飞行速度，不符合逻辑，必须置为0
        flySpeed = 0;
    }
}
