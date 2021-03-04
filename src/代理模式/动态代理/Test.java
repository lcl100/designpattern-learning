package 代理模式.动态代理;

public class Test {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherInterface target = new TeacherTarget();
        // 给目标对象创建代理对象
        TeacherInterface proxy = (TeacherInterface) new TeacherProxyFactory(target).getProxyInstance();
//        proxy.teach();
        // 通过代理对象，调用目标对象的方法
        String result = proxy.ask("李四");
        System.out.println(result);
    }
}
/**
 * 打印结果：
 * 教师请[李四, 王五, 赵六]起来回答问题。。。。。。
 * 回答一；补充回答二。
 */