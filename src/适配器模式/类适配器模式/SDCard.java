package 适配器模式.类适配器模式;

/**
 * @author lcl100
 * @create 2021-07-10 10:59
 * @desc SDCard接口类，定义读写SD卡的方法
 */
public interface SDCard {
    /**
     * 读取SD卡
     *
     * @return 读取的数据
     */
    public String readSD();

    /**
     * 向SD卡中写入数据
     * @param msg 待写入的数据
     */
    public void writeSD(String msg);
}
