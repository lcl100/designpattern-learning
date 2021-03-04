package 代理模式.动态代理;

/**
 * 目标对象，实现接口方法
 */
public class TeacherTarget implements TeacherInterface {
    @Override
    public void teach() {
        System.out.println("教师授课中。。。。。。");
    }

    @Override
    public String ask(String name) {
        System.out.println("教师请[" + name + "]起来回答问题。。。。。。");
        return "回答一";
    }
}
