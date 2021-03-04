package 单例模式.第6种_双重检查;

/**
 * @author lcl100
 * 双重检查
 * 1. 私有化构造方法
 * 2. 创建该类对象，用private static volatile修饰
 * 3. 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题，保证了效率，推荐使用
 */
public class Singleton {
    // 1. 私有化构造方法
    private Singleton() {

    }

    // 2. 创建该类对象，用private static volatile修饰
    private static volatile Singleton instance;

    // 3. 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题，保证了效率，推荐使用
    public static Singleton getInstance() {
        // 3.1 判断该对象是否已经被实例化了，如果没有，则实例化
        if (instance == null) {
            // 3.2 添加同步锁
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        // 3.3 如果已经实例化了，那么直接返回该对象即可
        return instance;
    }
}
