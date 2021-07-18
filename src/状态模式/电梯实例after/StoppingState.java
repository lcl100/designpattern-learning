package 状态模式.电梯实例after;

/**
 * @author lcl100
 * @create 2021-07-15 22:56
 * @desc 停止状态类
 */
public class StoppingState extends AbstractLiftState {
    @Override
    public void open() {
        // 处于停止状态，当然可以打开电梯门
        super.context.setState(Context.OPENING_STATE);// 修改状态
        super.context.getState().open();// 动作委托给CloseState来执行，也就是委托给了ClosingState子类来执行这个动作
    }

    @Override
    public void close() {
        //虽然可以关门，但这个动作不归我执行
        //状态修改
        super.context.setState(Context.CLOSING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.getState().close();
    }

    @Override
    public void run() {
        //停止状态再跑起来，正常的很
        //状态修改
        super.context.setState(Context.RUNNING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.getState().run();
    }

    @Override
    public void stop() {
        //停止状态是怎么发生的呢？当然是停止方法执行了
        System.out.println("电梯停止了...");
    }
}
