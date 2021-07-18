package 责任链模式.请假实例;

/**
 * @author lcl100
 * @create 2021-07-14 22:42
 * @desc 抽象处理者
 */
public abstract class Handler {
    protected final static int NUM_ONE=1;// 表示一天
    protected final static int NUM_THREE=3;// 表示三天
    protected final static int NUM_SEVEN=7;// 表示七天

    // 该领导处理的请求天数区间
    private int numStart;
    private int numEnd;

    // 声明后续者，即下一个具体处理者角色，也是上级领导
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    // 设置下一个处理者角色，即上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 各具体处理者角色处理请求的方法，是抽象方法，由具体各级领导处理请假条
    public abstract void handleLeave(LeaveRequest leave);

    // 提交请假条
    public final void submit(LeaveRequest leave){
        // 该领导审批
        this.handleLeave(leave);
        if(this.nextHandler!=null&&leave.getNum()>this.numEnd){
            // 提交给上级领导进行审批
            this.nextHandler.submit(leave);
        }else {
            // 没有上级领导了，流程结束
            System.out.println("流程结束！");
        }
    }
}
