package 单例模式.第2种_饿汉式之静态代码块;

/**
 * @author lcl100
 * 测试单例模式
 */
public class SingletonTest {
    public static void main(String[] args) {
        // 创建两个实例对象
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        // 判断是否其实只有一个实例
        System.out.println(singleton1 == singleton2);// true
        // 输出哈希值
        System.out.println("singleton1.hashCode() = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());
    }
}
