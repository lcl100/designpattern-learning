package 责任链模式.结构;

/**
 * @author lcl100
 * @create 2021-07-14 21:53
 * @desc 客户端类，即是测试类
 */
public class Client {
    public static void main(String[] args) {
        // 组装责任链
        Handler handlerA=new ConcreteHandlerA();
        Handler handlerB=new ConcreteHandlerB();
        handlerA.setNext(handlerB);
        // 提交请求
        handlerA.handleRequest("two");
    }
}
