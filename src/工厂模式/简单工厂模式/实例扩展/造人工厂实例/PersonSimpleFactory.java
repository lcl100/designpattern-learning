package 工厂模式.简单工厂模式.实例扩展.造人工厂实例;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author lcl100
 * @create 2021-07-20 20:46
 * @desc 生产不同皮肤人类的工厂，只需要根据传入的颜色参数，就可以让工厂生产不同皮肤种类的人
 */
public class PersonSimpleFactory {
    /**
     * 根据传入的不同颜色参数让工厂创建不同皮肤的人类
     *
     * @param color 人类皮肤的颜色，有三种：white、black和yellow
     * @return 返回创建成功的人类
     */
    public static Person createPerson(String color) {
        switch (color) {
            case "white":
                return new WhiteSkinPerson();
            case "black":
                return new BlackSkinPerson();
            case "yellow":
                return new YellowSkinPerson();
            default:
                return null;
        }
    }
}
