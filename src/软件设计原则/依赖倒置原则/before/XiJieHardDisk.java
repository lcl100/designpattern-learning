package 软件设计原则.依赖倒置原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 19:01
 * @desc 希捷硬盘
 */
public class XiJieHardDisk {
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}
