package 备忘录模式.实例之多次撤销;

/**
 * @author lcl100
 * @create 2021-07-18 8:54
 */
public class Originator {
    private String state;// 发起人的状态

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 发起人创建备忘录
     *
     * @return 返回创建成功的备忘录对象
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录中的数据
     *
     * @param memento 存有某一时刻发起人状态的备忘录对象
     */
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
