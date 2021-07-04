package 软件设计原则.里氏替换原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 16:32
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 设定飞行距离
        double flyDistance = 300;

        // 计算麻雀的飞行时间
        Bird sparrow = new Sparrow();
        sparrow.setFlySpeed(120);// 设定麻雀飞行速度为120
        double sparrowFlyTime = sparrow.getFlyTime(flyDistance);// 得到麻雀的飞行时间结果
        System.out.println(sparrowFlyTime);// 2.5

        // 计算企鹅的移动时间
        Animal penguin = new Penguin();
        penguin.setMoveSpeed(120);// 设定企鹅移动速度为120
        double penguinFlyTime = penguin.getMoveTime(flyDistance);// 得到企鹅的移动时间结果
        System.out.println(penguinFlyTime);// 2.5
    }
}
