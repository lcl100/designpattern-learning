package 软件设计原则.单一职责原则.after;

/**
 * @author lcl100
 * @create 2021-07-04 11:57
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        StudentJob studentJob=new StudentJob();
        // 生活辅导
        studentJob.lifeCounseling(new Counselor());
        // 学业指导
        studentJob.academicGuidance(new Tutor());
    }
}
