package 状态模式.结构;

/**
 * @author lcl100
 * @create 2021-07-15 22:11
 * @desc 具体状态类A
 */
public class ConcreteStateA extends AbstractState {
    @Override
    void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
