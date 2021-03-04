package 代理模式.cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TeacherProxyFactory implements MethodInterceptor {
    private Object target;// 该对象是目标类对象

    //构造器，传入一个被代理的对象
    public TeacherProxyFactory(Object target){
        this.target=target;
    }

    //返回一个代理对象: 是target对象的代理对象
    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept方法，会调用目标对象的方法
     * @param obj 指被代理的对象
     * @param method 指被调用的方法
     * @param args 该方法调用时所需要的参数
     * @param methodProxy JDK的java.lang.reflect.Method类的代理类，可以实现对源对象方法的调用
     * @return 返回该方法被调用的返回值
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws InvocationTargetException, IllegalAccessException {
        if(method.getName().equals("ask")){
            // 1.参数增强
            String name= (String) args[0];
            String newName=name+",李四,王五";
            // 2.调用目标对象的方法，通过反射机制，返回的是该方法的返回值
            System.out.println("cglib代理开始。。。");
            Object returnValue = method.invoke(target, newName);
            System.out.println("cglib代理提交。。。");
            // 3.返回值增强
            returnValue+="补充答案二。";
            return returnValue;
        }
        return method.invoke(target,args);
    }
}
