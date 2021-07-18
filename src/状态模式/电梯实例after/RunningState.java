package 状态模式.电梯实例after;

/**
 * @author lcl100
 * @create 2021-07-15 22:52
 * @desc 运行状态类
 */
public class RunningState extends AbstractLiftState{
    @Override
    public void open() {
        // 现在处于运行状态，居然想打开电梯门，不能开，所以什么也不执行
    }

    @Override
    public void close() {
        // 电梯门关闭，这是可以的，但虽然可以关闭，但这个动作不归我执行
    }

    @Override
    public void run() {
        // 这是在运行状态下要实现的方法
        System.out.println("电梯正在运行...");
    }

    @Override
    public void stop() {
        // 现在处于运行状态，当然可以停止电梯，不可能一直运行下去
        super.context.setState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
