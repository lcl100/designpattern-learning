package 责任链模式.请假实例;

/**
 * @author lcl100
 * @create 2021-07-14 22:55
 * @desc 具体处理者，总经理类
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);// 总经理能处理3~7天的请假
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("总经理审批：同意");
    }
}
