package 状态模式.结构;

/**
 * @author lcl100
 * @create 2021-07-15 22:13
 * @desc 具体状态类B
 */
public class ConcreteStateB extends AbstractState {

    @Override
    void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
