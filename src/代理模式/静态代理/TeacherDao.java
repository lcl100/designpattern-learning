package 代理模式.静态代理;

/**
 * 目标对象，实现TeacherDaoInterface接口的所有方法
 */
public class TeacherDao implements TeacherDaoInterface {
    @Override
    public void teach() {
        System.out.println(" 老师授课中	。。。。。");
    }
}
