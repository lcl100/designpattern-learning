package 状态模式.电梯实例after;

/**
 * @author lcl100
 * @create 2021-07-15 23:11
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ClosingState());// 设置初始状态

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
