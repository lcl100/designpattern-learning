package 责任链模式.请假实例;

/**
 * @author lcl100
 * @create 2021-07-14 22:
 * @desc 具体处理者，小组长类
 */
public class GroupLeader extends Handler {


    public GroupLeader() {
        super(0,Handler.NUM_ONE);// 小组长只能审批1天之内的请假
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("小组长审批：同意");
    }
}
