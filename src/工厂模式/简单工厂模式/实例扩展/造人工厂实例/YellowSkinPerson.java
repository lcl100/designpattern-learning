package 工厂模式.简单工厂模式.实例扩展.造人工厂实例;

/**
 * @author lcl100
 * @create 2021-07-20 20:44
 * @desc 具体产品类，黄色皮肤的人类
 */
public class YellowSkinPerson implements Person {
    @Override
    public String getType() {
        return "黄色皮肤的人类";
    }
}
