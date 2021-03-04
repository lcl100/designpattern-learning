package 单例模式.第8种_枚举;

public class SingletonTest {
    public static void main(String[] args) {
        // 创建两个实例对象
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        // 判断是否其实只有一个实例
        System.out.println(singleton1 == singleton2);// true
        // 输出哈希值
        System.out.println("singleton1.hashCode() = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());

        // 调用方法
        singleton1.method();
    }
}
