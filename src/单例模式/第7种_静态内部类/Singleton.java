package 单例模式.第7种_静态内部类;

/**
 * @author lcl100
 * 静态内部类
 * 1. 私有化构造方法
 * 2. 写一个静态内部类，该类种有一个静态属性INSTANCE
 * 3. 提供一个静态的公有方法，直接返回静态内部类的INSTANCE属性
 */
public class Singleton {
    // 1. 私有化构造方法
    private Singleton() {

    }

    // 2. 写一个静态内部类，该类种有一个静态属性INSTANCE
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3. 提供一个静态的公有方法，直接返回静态内部类的INSTANCE属性
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}