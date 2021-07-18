package 备忘录模式.实例之多次撤销;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-07-18 8:
 * @desc 管理者类
 */
public class Caretaker {
    private List<Memento> list = new ArrayList<>();

    /**
     * 设置备忘录，实际上是添加到list集合
     *
     * @param memento 待保存的备忘录
     */
    public void setMemento(Memento memento) {
        list.add(memento);
    }

    /**
     * 获取指定索引位置的备忘录，得到某个特定的状态
     *
     * @param i 指定索引
     * @return 返回得到的备忘录
     */
    public Memento getMemento(int i) {
        // 参数校验
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }
}
