package 责任链模式.结构;

/**
 * @author lcl100
 * @create 2021-07-14 21:42
 * @desc 抽象处理者角色
 */
public abstract class Handler {
    private Handler next;// 下一个处理者角色

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    // 处理请求的方法，每个处理者的处理方式不一样，所以定义成抽象方法，由具体实现者完成
    public abstract void handleRequest(String request);
}
