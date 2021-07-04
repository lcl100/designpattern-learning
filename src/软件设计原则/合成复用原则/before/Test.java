package 软件设计原则.合成复用原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 23:03
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 白色电动汽车移动
        Car whiteElectricCar=new WhiteElectricCar();
        whiteElectricCar.move();
    }
}
