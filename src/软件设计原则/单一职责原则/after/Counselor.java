package 软件设计原则.单一职责原则.after;

/**
 * @author lcl100
 * @create 2021-07-04 11:51
 * @desc 辅导员类，负责学生的生活辅导
 */
public class Counselor {
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
}
