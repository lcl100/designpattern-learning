package 单例模式.第5种_懒汉式之线程安全之同步代码块;

/**
 * @author lcl100
 * 懒汉式（线程安全，同步代码块）
 * 1. 私有化构造方法
 * 2. 创建该类对象，用private static修饰
 * 3. 提供一个静态的公有方法，在该方法内部实例化对象，并添加synchronized关键字，即当使用该方法时才创建instance
 */
public class Singleton {
    // 1. 私有化构造方法
    private Singleton() {

    }

    // 2. 创建该类对象，用private static修饰
    private static Singleton instance;

    // 3. 提供一个静态的公有方法，在该方法内部实例化对象，并添加synchronized关键字，即当使用该方法时才创建instance
    public static Singleton getInstance() {
        // 3.1 判断该对象是否已经被实例化了，如果没有，则实例化
        if (instance == null) {
            // 3.2 添加同步锁
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        // 3.3 如果已经实例化了，那么直接返回该对象即可
        return instance;
    }
}
