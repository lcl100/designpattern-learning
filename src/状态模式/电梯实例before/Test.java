package 状态模式.电梯实例before;

/**
 * @author lcl100
 * @create 2021-07-15 21:52
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(Lift.CLOSING_STATE);// 设置电梯的状态是关闭状态

        lift.open();// 开门
        lift.close();// 关门
        lift.run();// 运行
        lift.stop();// 停止
    }
}
