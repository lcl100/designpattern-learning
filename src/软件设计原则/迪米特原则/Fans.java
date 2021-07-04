package 软件设计原则.迪米特原则;

/**
 * @author lcl100
 * @create 2021-07-03 22:27
 * @desc 粉丝类
 */
public class Fans {
    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
