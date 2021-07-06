package 建造者模式;

/**
 * @author lcl100
 * @create 2021-07-06 22:34
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建指挥者对象
        Director director=new Director(new MobileBuilder());
        // 让指挥者只会组装自行车
        Bike bike = director.construct();
        // 打印结果
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
