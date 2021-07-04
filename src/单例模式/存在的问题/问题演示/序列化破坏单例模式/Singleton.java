package 单例模式.存在的问题.问题演示.序列化破坏单例模式;

import java.io.Serializable;

/**
 * @author lcl100
 * @create 2021-07-04 12:58
 * @desc 单例类，使用的是静态内部类实现单例模式
 */
public class Singleton implements Serializable {// 实现Serializable接口表示可序列化
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
