package 工厂模式.简单工厂模式.实例扩展.造人工厂实例;

/**
 * @author lcl100
 * @create 2021-07-20 20:43
 * @desc 具体产品类，黑色皮肤的人类
 */
public class BlackSkinPerson implements Person {
    @Override
    public String getType() {
        return "黑色皮肤的人类";
    }
}
