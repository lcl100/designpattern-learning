package 组合模式;

/**
 * @author lcl100
 * @create 2021-07-11 10:24
 * @desc 菜单项类，属于叶子节点，不能添加、删除等对子菜单项的操作
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        // 打印菜单项的名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");// 打印缩进，方便看清楚层级关系
        }
        System.out.println(name);
    }
}
