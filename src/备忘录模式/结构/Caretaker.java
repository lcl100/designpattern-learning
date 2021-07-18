package 备忘录模式.结构;

/**
 * @author lcl100
 * @create 2021-07-18 8:11
 * @desc 管理者，管理备忘录，不让发起人直接访问备忘录，而是通过管理者来操作
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
