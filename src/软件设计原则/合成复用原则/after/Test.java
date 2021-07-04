package 软件设计原则.合成复用原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 23:21
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 设定汽车的颜色和动力源
        Color color = new Color("白色");
        Power power = new Power("电动");
        Car car = new Car(color, power);
        // 调用move方法
        car.move();
    }
}
