package 适配器模式.对象适配器模式;

/**
 * @author lcl100
 * @create 2021-07-10 11:23
 * @desc 电脑类，可以读取SD卡
 */
public class Computer {
    //从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw  new NullPointerException("sd card is not null");
        }
        // 调用SDCard的readSD()方法读取SD卡中的数据
        return sdCard.readSD();
    }
}
