package 备忘录模式.结构;

/**
 * @author lcl100
 * @create 2021-07-18 8:16
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建发起人
        Originator originator = new Originator();
        // 创建管理者
        Caretaker caretaker = new Caretaker();

        // 设置发起人的状态
        originator.setState("S0");
        System.out.println("初始状态：" + originator.getState());// 打印设置后的状态
        caretaker.setMemento(originator.createMemento());// 发起人创建备忘录，并将备忘录保存到管理者中

        // 再次设置发起人新的状态
        originator.setState("S1");
        System.out.println("新的状态：" + originator.getState());// 打印设置后的状态

        // 恢复S0状态
        originator.restoreMemento(caretaker.getMemento());// 将保存在管理者那儿的备忘录恢复过来
        System.out.println("恢复状态：" + originator.getState());// 打印恢复后的状态
    }
}
