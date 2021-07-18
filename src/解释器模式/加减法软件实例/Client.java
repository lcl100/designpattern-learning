package 解释器模式.加减法软件实例;

/**
 * @author lcl100
 * @create 2021-07-18 12:
 * @desc 测试类
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // 创建变量表达式
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");
        // 为变量表达式赋值
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        context.assign(e, 5);

        AbstractExpression expression = new Minus(new Plus(new Plus(new Plus(a, b), c), d), e);
        System.out.println(expression + "=" + expression.interpret(context));
    }
}
