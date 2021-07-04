package 软件设计原则.迪米特原则;

/**
 * @author lcl100
 * @create 2021-07-03 22:28
 * @desc 媒体公司类
 */
public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
