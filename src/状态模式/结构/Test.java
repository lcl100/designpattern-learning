package 状态模式.结构;

/**
 * @author lcl100
 * @create 2021-07-15 22:19
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        Context context=new Context();// 创建环境，已经在构造方法内初始化了状态，即已有默认状态
        context.Handle();// 处理请求
        context.Handle();// 处理请求
        context.Handle();// 处理请求
        context.Handle();// 处理请求
    }
}
