package 软件设计原则.里氏替换原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 16:20
 * @desc 鸟类，定义了鸟的一般行为
 */
public class Bird extends Animal{
    private double flySpeed;// 鸟的飞行速度

    /**
     * 设置鸟的飞行速度
     *
     * @param flySpeed 鸟的飞行速度
     */
    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    /**
     * 根据鸟的飞行距离和飞行速度来计算飞行时间
     *
     * @param flyDistance 鸟的飞行距离
     * @return 返回计算成功的鸟的飞行时间
     */
    public double getFlyTime(double flyDistance) {
        return flyDistance / flySpeed;
    }
}
