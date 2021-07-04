package 单例模式.存在的问题.问题解决.解决反射破坏单例模式;

/**
 * @author lcl100
 * @create 2021-07-04 12:58
 * @desc 单例类，使用的是静态内部类实现单例模式
 */
public class Singleton {
    private static boolean flag = false;

    private Singleton() {
        /**
         * 解决反射破坏单例模式的代码
         */
        synchronized (Singleton.class) {// 解决多线程安全问题
            //判断flag的值是否是true，如果是true，说明非第一次访问，直接抛一个异常，如果是false的话，说明第一次访问
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            //将flag的值设置为true
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
