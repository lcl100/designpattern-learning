package 状态模式.结构;

/**
 * @author lcl100
 * @create 2021-07-15 22:07
 * @desc 环境类
 */
public class Context {
    private AbstractState state;

    Context() {
        // 定义环境的初始状态
        this.state = new ConcreteStateA();// 即设置一个初始状态，可以任意一个初始状态
    }

    // 设置新状态
    public void setState(AbstractState state) {
        this.state = state;
    }

    // 读取当前环境中的状态
    public AbstractState getState() {
        return state;
    }

    // 对请求进行处理
    public void Handle() {
        state.Handle(this);
    }
}
