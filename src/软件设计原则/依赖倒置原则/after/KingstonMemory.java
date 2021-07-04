package 软件设计原则.依赖倒置原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 19:03
 * @desc 金士顿的内存
 */
public class KingstonMemory implements Memory {
    public void save(){
        System.out.println("使用金士顿作为内存条");
    }
}
