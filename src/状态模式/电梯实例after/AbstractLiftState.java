package 状态模式.电梯实例after;

/**
 * @author lcl100
 * @create 2021-07-15 22:41
 * @desc 抽象状态类
 */
public abstract class AbstractLiftState {
    // 定义一个环境角色类，也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 电梯开门动作
    public abstract void open();

    // 电梯关闭动作
    public abstract void close();

    // 电梯运行动作
    public abstract void run();

    // 电梯停止动作
    public abstract void stop();
}
