package 单例模式.第1种_饿汉式之静态常量;

/**
 * @author lcl100
 * 饿汉式（静态常量）
 * 1. 构造器私有化，使外部无法new它
 * 2. 本类中创建该类对象实例，并且是私有静态常量修饰（即private final static）
 * 3. 提供一个公有的静态方法，返回该实例对象
 */
public class Singleton {
    // 1. 构造器私有化，使外部无法new它
    private Singleton() {

    }

    // 2. 本类中创建该类对象实例，并且是静态常量修饰
    private final static Singleton instance = new Singleton();

    // 3. 提供一个公有的静态方法，返回该实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
