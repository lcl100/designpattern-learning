package 享元模式;

/**
 * @author lcl100
 * @create 2021-07-11 11:51
 * @desc 抽象享元角色，俄罗斯方块有不同的形状，我们可以对这些形状向上抽取出AbstractBox，用来定义共性的属性和行为。
 */
public abstract class AbstractBox {
    // 获取图形的方法
    public abstract String getShape();

    // 显示图形及颜色
    public void display(String color) {
        System.out.println("方块形状：" + getShape() + "，颜色：" + color);
    }
}
