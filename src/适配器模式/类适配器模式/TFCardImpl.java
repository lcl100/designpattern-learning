package 适配器模式.类适配器模式;

/**
 * @author lcl100
 * @create 2021-07-10 11:12
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg ： hello word TFcard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg :" + msg);
    }
}
