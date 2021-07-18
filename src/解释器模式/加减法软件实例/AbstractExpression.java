package 解释器模式.加减法软件实例;

/**
 * @author lcl100
 * @create 2021-07-18 12:06
 * @desc 抽象表达式角色
 */
public abstract class AbstractExpression {
    /**
     * 解释表达式
     * @param context
     * @return
     */
    abstract int interpret(Context context);
}
