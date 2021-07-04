package 软件设计原则.里氏替换原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 17:21
 * @desc 动物类，是鸟类和企鹅类的父类
 */
public class Animal {
    private double moveSpeed;// 移动速度

    /**
     * 设置动物的移动速度
     *
     * @param moveSpeed 动物的移动速度
     */
    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    /**
     * 计算动物的移动速度
     *
     * @param moveDistance 给定的移动距离
     * @return 返回计算成功的移动时间
     */
    public double getMoveTime(double moveDistance) {
        return moveDistance / moveSpeed;
    }
}
