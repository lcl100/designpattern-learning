package 软件设计原则.迪米特原则;

/**
 * @author lcl100
 * @create 2021-07-03 22:29
 * @desc 明星类
 */
public class Star {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
