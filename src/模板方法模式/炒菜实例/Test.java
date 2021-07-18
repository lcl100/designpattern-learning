package 模板方法模式.炒菜实例;

/**
 * @author lcl100
 * @create 2021-07-12 21:51
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 炒包菜
        ConcreteClass_BaoCai baoCai=new ConcreteClass_BaoCai();
        // 调用方法进行炒菜
        baoCai.cookProcess();
    }
}
