package 适配器模式.对象适配器模式;

/**
 * @author lcl100
 * @create 2021-07-10 11:02
 * @desc SDCard接口实现类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg ： hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg ：" + msg);
    }
}
