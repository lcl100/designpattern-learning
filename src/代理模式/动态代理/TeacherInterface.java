package 代理模式.动态代理;

/**
 * 接口，定义方法，让目标对象与代理对象实现该接口的方法
 */
public interface TeacherInterface {
    /**
     * 教师授课
     */
    void teach();

    /**
     * 教师让某一位学生回答问题
     *
     * @param name 学生名字
     * @return 学生回答的内容
     */
    String ask(String name);
}
