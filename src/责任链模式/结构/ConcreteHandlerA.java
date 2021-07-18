package 责任链模式.结构;

/**
 * @author lcl100
 * @create 2021-07-14 21:46
 * @desc 具体处理者角色A
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者A负责处理该请求！");
        } else {
            // 交由下一个处理者角色处理
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
