package 适配器模式.对象适配器模式;

/**
 * @author lcl100
 * @create 2021-07-10 11:05
 * @desc TFCard接口类，添加读写TF卡的方法
 */
public interface TFCard {
    /**
     * 读取TF卡中的数据
     *
     * @return
     */
    public String readTF();

    /**
     * 向TF卡中写入数据
     *
     * @param msg 待写入的数据
     */
    public void writeTF(String msg);
}
