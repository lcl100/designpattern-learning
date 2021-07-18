package 观察者模式.警察抓小偷实例;

/**
 * @author lcl100
 * @create 2021-07-17 10:55
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建小偷对象
        Thief t = new Thief("隔壁老王");
        //创建警察对象
        PoliceMan p = new PoliceMan("小李");
        //让警察盯着小偷
        t.addObserver(p);
        //小偷偷东西
        t.steal();
    }
}
