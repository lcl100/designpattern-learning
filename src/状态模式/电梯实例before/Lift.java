package 状态模式.电梯实例before;

/**
 * @author lcl100
 * @create 2021-07-15 21:41
 * @desc 电梯实现类
 */
public class Lift implements ILift {
    // 电梯状态
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    // 打开门的动作
    @Override
    public void open() {
        // 当要打开门时，判断当前电梯的状态，如果电梯是打开状态则不需要再打开，如果电梯是关闭状态则可以打开门，如果...
        switch (this.state) {
            case OPENING_STATE://门已经开了，不能再开门了
                //do nothing
                break;
            case CLOSING_STATE://关门状态，门打开:
                System.out.println("电梯门打开了。。。");
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //do nothing 运行时电梯不能开门
                break;
            case STOPPING_STATE:
                System.out.println("电梯门开了。。。");//电梯停了，可以开门了
                this.setState(OPENING_STATE);// 重置电梯状态
                break;
        }
    }

    @Override
    public void close() {
        // 判断电梯状态，才能决定能否关闭电梯的运行
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("电梯关门了......");// 只有开门状态才能关闭电梯门
                this.setState(CLOSING_STATE);// 关门之后电梯就是关闭状态了
                break;
            case CLOSING_STATE:
                // 已经是关闭状态，不能关门了
                break;
            case RUNNING_STATE:
                // 运行时电梯门是关闭着的，不能关门
                break;
            case STOPPING_STATE:
                // 停止时电梯也是关着的，不能关门
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE: //开门的电梯已经是是停止的了(正常情况下)
                //do nothing
                break;
            case CLOSING_STATE://关门时才可以停止
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);// 重置电梯状态
                break;
            case RUNNING_STATE://运行时当然可以停止了
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                //do nothing
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE://电梯不能开着门就走
                //do nothing
                break;
            case CLOSING_STATE://门关了，可以运行了
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);//现在是运行状态
                break;
            case RUNNING_STATE:
                //do nothing 已经是运行状态了
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);
                break;
        }
    }
}
