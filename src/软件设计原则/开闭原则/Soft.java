package 软件设计原则.开闭原则;

/**
 * @author lcl100
 * @create 2021-07-03 15:55
 * @desc 软件类，使用主题
 */
public class Soft {
    private AbstractTheme theme;

    public Soft() {
    }

    public Soft(AbstractTheme theme) {
        this.theme = theme;
    }

    public void setTheme(AbstractTheme theme) {
        this.theme = theme;
    }

    public void display(){
        theme.show();
    }
}
