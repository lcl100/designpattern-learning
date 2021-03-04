package 代理模式.cglib代理;


public class Test {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherTarget target = new TeacherTarget();
        // 给目标对象创建代理对象
        TeacherTarget proxy = (TeacherTarget) new TeacherProxyFactory(target).getProxyInstance();
//        proxy.teach();
        // 通过代理对象，调用目标对象的方法
        String result = proxy.ask("李四");// 调用方法
        System.out.println(result);// 打印返回值
    }
}
/**
 * 打印结果：
 * cglib代理开始。。。
 * 教师请[李四,李四,王五]起来回答问题。。。。。。
 * cglib代理提交。。。
 * 回答一补充答案二。
 */