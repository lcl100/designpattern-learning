package 责任链模式.结构;

/**
 * @author lcl100
 * @create 2021-07-14 21:49
 * @desc 具体处理者角色B
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        // 处理责任链是按顺序的
        if (request.equals("two")) {// 当前处理者角色处理
            System.out.println("具体处理者B负责处理该请求！");
        } else {// 当前处理者角色不能处理，交由下一个处理者处理
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
