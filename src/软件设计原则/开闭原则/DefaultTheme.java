package 软件设计原则.开闭原则;

/**
 * @author lcl100
 * @create 2021-07-03 15:54
 * @desc 默认主题类，实现抽象主题类AbstractTheme中的show方法
 */
public class DefaultTheme extends AbstractTheme {
    @Override
    public void show() {
        System.out.println("默认主题");
    }
}
