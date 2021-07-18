package 适配器模式.类适配器模式;

/**
 * @author lcl100
 * @create 2021-07-10 11:26
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的数据
        String sdCardMsg = computer.readSD(new SDCardImpl());
        System.out.println(sdCardMsg);

        System.out.println("=================================");

        // 现在要使用电脑读取TF卡中的数据了
        String tfCardMsg = computer.readSD(new SDAdapterTF());// 定义适配器类
        System.out.println(tfCardMsg);
    }
}
