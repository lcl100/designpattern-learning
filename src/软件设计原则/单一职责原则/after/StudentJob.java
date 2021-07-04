package 软件设计原则.单一职责原则.after;

/**
 * @author lcl100
 * @create 2021-07-04 11:53
 * @desc 学生工作类
 */
public class StudentJob {
    /**
     * 生活辅导
     *
     * @param teacher 辅导员
     */
    public void lifeCounseling(Counselor teacher) {
        teacher.attendanceManagement();
        teacher.classCommitteeConstruction();
        teacher.classWindConstruction();
        teacher.faq();
        teacher.feeCollection();
        teacher.psychologicalCounseling();
    }

    /**
     * 学业指导
     *
     * @param tutor 学业导师
     */
    public void academicGuidance(Tutor tutor) {
        tutor.professionalGuidance();
        tutor.studyCounseling();
        tutor.summarize();
    }
}
