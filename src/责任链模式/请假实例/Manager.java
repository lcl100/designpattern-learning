package 责任链模式.请假实例;

/**
 * @author lcl100
 * @create 2021-07-14 22:53
 * @desc 具体处理者，部门经理类
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);// 部门经理能处理1~3天的请假
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("部门经理审批：同意");
    }
}
