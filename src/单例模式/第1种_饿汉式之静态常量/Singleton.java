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

    /**
     * 2. 本类中创建该类对象实例，并且是静态常量修饰
     * private表示该变量不应该被外部类访问
     * final表示创建后不能修改
     * static是因为需要在静态方法中使用该变量，所以必须是static
     */
    private final static Singleton instance = new Singleton();

    /**
     * 3. 提供一个公有的静态方法，返回该实例对象
     *
     * @return 单实例对象
     */
    public static Singleton getInstance() {
        return instance;
    }
}
