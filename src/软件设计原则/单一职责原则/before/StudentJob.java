package 软件设计原则.单一职责原则.before;

/**
 * @author lcl100
 * @create 2021-07-04 11:33
 * @desc 学生工作类
 */
public class StudentJob {
    public void classCommitteeConstruction() {
        System.out.println("班委建设");
    }

    public void attendanceManagement() {
        System.out.println("出勤管理");
    }

    public void psychologicalCounseling() {
        System.out.println("心理辅导");
    }

    public void feeCollection() {
        System.out.println("费用收取");
    }

    public void classWindConstruction() {
        System.out.println("班风建设");
    }

    public void faq() {
        System.out.println("答疑解惑");
    }

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
