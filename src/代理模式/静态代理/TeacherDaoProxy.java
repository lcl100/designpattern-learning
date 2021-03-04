package 代理模式.静态代理;

/**
 * 代理对象，实现TeacherDaoInterface接口的所有方法，并对代理对象的方法进行一定程度上增强
 */
public class TeacherDaoProxy implements TeacherDaoInterface {
    private TeacherDaoInterface target; // 目标对象，通过接口来聚合

    //构造器
    public TeacherDaoProxy(TeacherDaoInterface target) {
        this.target = target;
    }

    // 增强方法的功能
    // 但需要调用目标对象TeacherDao.java中的teach()方法，该如何调用呢？就是通过TeacherDaoInterface.java来作中间媒介进行调用
    @Override
    public void teach() {
        System.out.println("开始代理，完成某些操作。。。。。 ");//也可以调用些方法
        target.teach();
        System.out.println("提交。。。。。");//也可以调用些方法
    }
}