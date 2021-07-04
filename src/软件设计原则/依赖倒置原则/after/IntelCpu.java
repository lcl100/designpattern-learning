package 软件设计原则.依赖倒置原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 19:02
 * @desc Intel的CPU
 */
public class IntelCpu implements Cpu {
    public void run(){
        System.out.println("使用Intel处理器");
    }
}
