package 备忘录模式.实例之多次撤销;

/**
 * @author lcl100
 * @create 2021-07-18 8:50
 * @desc 备忘录类，负责存储发起人的内部状态
 */
public class Memento {
    private String state;// 本例中的状态只是简单的字符串，可以有更复杂的状态

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
