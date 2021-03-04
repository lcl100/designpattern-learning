package 单例模式.第2种_饿汉式之静态代码块;

/**
 * @author lcl100
 * 饿汉式（静态代码块）
 * 1. 构造器私有化，使外部无法new它
 * 2. 本类中创建该类对象变量，并用private static修饰，然后在静态代码块中创建单例对象
 * 3. 提供一个公有的静态方法，返回该实例对象
 */
public class Singleton {
    // 1. 构造器私有化，使外部无法new它
    private Singleton(){

    }

    // 2. 本类中创建该类对象变量，并用private static修饰，然后在静态代码块中创建单例对象
    // 2.1 创建类对象
    private static Singleton instance;
    // 2.2 在静态代码块种实例化，即创建单例对象
    static {
        instance=new Singleton();
    }

    // 3. 提供一个公有的静态方法，返回该实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
