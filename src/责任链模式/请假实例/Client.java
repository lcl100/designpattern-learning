package 责任链模式.请假实例;

/**
 * @author lcl100
 * @create 2021-07-14 22:56
 * @desc 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小明",5,"身体不适");

        // 创建各级领导对象，即具体的处理者
        GroupLeader groupLeader=new GroupLeader();
        Manager manager=new Manager();
        GeneralManager generalManager=new GeneralManager();

        // 组装责任链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 小明提交请假申请
        groupLeader.submit(leave);
    }
}
