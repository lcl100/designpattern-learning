package 状态模式.电梯实例after;

/**
 * @author lcl100
 * @create 2021-07-15 22:44
 * @desc 开启状态类
 */
public class OpeningState extends AbstractLiftState {
    @Override
    public void open() {
        // 处于开启状态，那么表示电梯正处于开启状态，不能再开启了
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        // 当前处于开门状态，那么就可以执行关门动作，关闭门
        // 修改门的状态
        super.context.setState(Context.CLOSING_STATE);
        // 动作委托给ClosingState子类执行这个动作
        super.context.getState().close();
    }

    @Override
    public void run() {
        // 电梯门不能处于开启运行，必须关门才能上下运行，所以这里什么也不要做
    }

    @Override
    public void stop() {
        // 处于开门状态，说明此时电梯已经停止了
    }
}
