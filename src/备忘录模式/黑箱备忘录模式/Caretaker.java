package 备忘录模式.黑箱备忘录模式;

/**
 * @author lcl100
 * @create 2021-07-18 9:25
 * @desc 负责人角色类Caretaker能够得到的备忘录对象是以MementoInterface为接口的，由于这个接口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容
 */
public class Caretaker {
    private MementoInterface memento;

    public MementoInterface getMemento() {
        return memento;
    }

    public void setMemento(MementoInterface memento) {
        this.memento = memento;
    }
}
