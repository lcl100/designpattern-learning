package 单例模式.存在的问题.问题解决.解决反射破坏单例模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lcl100
 * @create 2021-07-04 13:15
 * @desc 测试类，判断通过反射创建的对象是否能破坏单例模式
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取Singleton类的字节码对象
        Class<Singleton> clazz = Singleton.class;
        // 获取Singleton类的私有无参构造方法对象
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        // 取消访问检查
        constructor.setAccessible(true);

        // 创建Singleton类的对象
        Singleton s1 = constructor.newInstance();
        Singleton s2 = constructor.newInstance();// 只有第二次创建的时候才会抛出异常，第一次不会

        // 判断通过反射的创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);// true
    }
}
