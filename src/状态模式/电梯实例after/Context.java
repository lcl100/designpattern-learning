package 状态模式.电梯实例after;

/**
 * @author lcl100
 * @create 2021-07-15 23:04
 * @desc 环境角色类
 */
public class Context {
    // 定义出所有的电梯状态
    public final static OpeningState OPENING_STATE = new OpeningState();// 开门状态，这时候电梯门只能关闭
    public final static ClosingState CLOSING_STATE = new ClosingState();// 关闭状态，这时候电梯可以运行、停止和开门
    public final static RunningState RUNNING_STATE = new RunningState();// 运行状态，这时候只能停止
    public final static StoppingState STOPPING_STATE = new StoppingState();// 停止状态，这时候电梯可以开门、运行

    // 定义一个当前电梯状态
    private AbstractLiftState state;

    public void setState(AbstractLiftState state) {
        this.state = state;// 当前环境改变
        this.state.setContext(this);// 把当前环境通知到各个实现类中
    }

    public AbstractLiftState getState() {
        return state;
    }

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

    public void run() {
        this.state.run();
    }

    public void stop() {
        this.state.stop();
    }
}
