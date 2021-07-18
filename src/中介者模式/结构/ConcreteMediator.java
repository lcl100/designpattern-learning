package 中介者模式.结构;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-07-17 11:
 * @desc 具体中介者
 */
public class ConcreteMediator extends AbstractMediator {
    // 具体中介者是一个注册中心，注册所有的同事类，用一个集合来存储
    private List<AbstractColleague> colleagues = new ArrayList<>();

    @Override
    public void register(AbstractColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(AbstractColleague colleague) {
        // 让其他的所有同事类都收到请求
        for (AbstractColleague ac : colleagues) {
            if (!ac.equals(colleague)) {// 排除请求的发出者，因为他是发出请求的人，不需要再接收该请求了
                ac.receive();
            }
        }
    }
}
