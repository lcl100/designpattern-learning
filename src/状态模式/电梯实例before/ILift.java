package 状态模式.电梯实例before;

/**
 * @author lcl100
 * @create 2021-07-15 21:36
 * @desc 电梯接口
 */
public interface ILift {
    // 定义电梯的四种状态
    public int OPENING_STATE = 1;// 打开状态
    public int CLOSING_STATE = 2;// 关闭状态
    public int RUNNING_STATE = 3;// 运行状态
    public int STOPPING_STATE = 4;// 停止状态

    /**
     * 设置电梯的状态
     *
     * @param state 电梯的状态
     */
    void setState(int state);

    /**
     * 打开电梯
     */
    void open();

    /**
     * 关闭电梯
     */
    void close();

    /**
     * 停止电梯
     */
    void stop();

    /**
     * 运行电梯
     */
    void run();
}
