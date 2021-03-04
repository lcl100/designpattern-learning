package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 工厂类，可以不断动态生成代理对象
 */
public class TeacherProxyFactory {
    // 维护一个目标对象Object
    private Object target;

    // 但要调用该对象的方法，所以需要通过构造器传入参数
    public TeacherProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象，生成一个代理对象
    // 调用Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)生成代理对象
    // 参数说明：
    //      ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
    //      Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
    //      InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
    // 这三个参数是固定写法，简述如下：
    //      1. 类加载器：目标对象.getClass().getClassLoader()
    //      2. 接口数组：目标对象.getClass().getInterfaces()
    //      3. 处理器：new InvocationHandler()
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            /*
                代理逻辑编写的方法：代理对象调用的所有方法都会触发该方法执行
                    参数：
                        1. proxy:代理对象
                        2. method：代理对象调用的方法，被封装为的对象，这里即是TeacherInterface.java中的方法。
                        3. args:代理对象调用的方法时，传递的实际参数，这里即是ask(name)方法中的name参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // System.out.println(method.getName()); // method.getName() 可以被调用方法的方法名，例如：ask、teach等
                // System.out.println(args[0]);// 即被调用方法中的参数
                // 判断是否是ask方法被调用了
                if (method.getName().equals("ask")) {
                    // 1.可以增强方法参数
                    String name = (String) args[0];
                    String newName = name + ", 王五, 赵六";
                    // 2.反射机制调用目标对象的方法
                    System.out.println("JDK代理开始。。。");
                    String returnValue = (String) method.invoke(target, newName);// 调用方法后的返回结果，这里是调用ask()方法后返回的值
                    System.out.println("JDK代理提交。。。");
                    // 3.可以增强返回值
                    return returnValue + "；补充回答二。";
                }
                // 如果不是ask方法而是其他方法，则调用对应目标对象的方法
                Object returnValue = method.invoke(target, args);
                return returnValue;
            }
        });
    }
}
