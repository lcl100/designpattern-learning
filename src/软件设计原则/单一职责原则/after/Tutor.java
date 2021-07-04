package 软件设计原则.单一职责原则.after;

/**
 * @author lcl100
 * @create 2021-07-04 11:52
 * @desc 学业导师类，负责学生的学业指导
 */
public class Tutor {
    public void professionalGuidance() {
        System.out.println("专业指导");
    }

    public void studyCounseling() {
        System.out.println("学习辅导");
    }

    public void summarize() {
        System.out.println("学习总结");
    }
}
