package 责任链模式.请假实例;

/**
 * @author lcl100
 * @create 2021-07-14 22:50
 * @desc 请假条类，不属于责任链模式中的角色类
 */
public class LeaveRequest {
    private String name;// 姓名
    private int num;// 请假天数
    private String content;// 请假内容

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
