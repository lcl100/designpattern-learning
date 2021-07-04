package 软件设计原则.开闭原则;

/**
 * @author lcl100
 * @create 2021-07-03 15:57
 * @desc 测试类，测试Soft程序的功能
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建软件对象
        Soft soft = new Soft();
        // 2.创建主题对象
//        DefaultTheme theme=new DefaultTheme();// 使用默认主题
//        BlackTheme theme=new BlackTheme();// 使用黑色主题
        LightTheme theme = new LightTheme();// 使用亮色主题
        // 3.为软件设置主题
        soft.setTheme(theme);
        // 4.显示主题
        soft.display();
    }
}
