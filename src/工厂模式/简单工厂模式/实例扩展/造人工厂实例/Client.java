package 工厂模式.简单工厂模式.实例扩展.造人工厂实例;


/**
 * @author lcl100
 * @create 2021-07-20 20:
 * @desc 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 调用工厂的方法来生产不同的皮肤的人类，通过color参数指定皮肤颜色
        Person person = PersonSimpleFactory.createPerson("yellow");
        // 调用方法
        System.out.println(person.getType());
    }
}
