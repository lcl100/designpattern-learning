package 备忘录模式.黑箱备忘录模式;

/**
 * @author lcl100
 * @create 2021-07-18 9:23
 * @desc 定义发起人类Originator，并在内部定义备忘录内部类Memento（该内部类设置为私有的）
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
    public MementoInterface createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录中的数据
     *
     * @param memento 存有某一时刻发起人状态的备忘录对象
     */
    public void restoreMemento(MementoInterface memento) {
        Memento m=(Memento)memento;
        this.setState(m.getState());
    }


    // 内部类
    private class Memento implements MementoInterface{
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
}
