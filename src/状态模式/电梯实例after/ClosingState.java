package 状态模式.电梯实例after;

/**
 * @author lcl100
 * @create 2021-07-15 23:01
 * @desc 关闭状态类
 */
public class ClosingState extends AbstractLiftState {
    @Override
    public void open() {
        //电梯门关了再打开，逗你玩呢，那这个允许呀
        super.context.setState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        // 电梯门关闭，这是关闭状态要实现的动作
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        // 电梯门关了再运行，这是可以的
        super.context.setState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        //电梯门关着，我就不按楼层
        super.context.setState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
