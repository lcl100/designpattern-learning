package 适配器模式.对象适配器模式;

/**
 * @author lcl100
 * @create 2021-07-10 14:15
 * @desc 适配器类，实现目标接口中的方法
 */
public class SDAdapterTF implements SDCard {
    // 声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        // 实际上却是调用适配者实现类中的readTF()方法读取TF卡中的数据
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        // 实际上却是调用适配者实现类中的writeTF()方法向TF卡写入数据
        tfCard.writeTF(msg);
    }
}
