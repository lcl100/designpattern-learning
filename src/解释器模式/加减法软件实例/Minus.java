package 解释器模式.加减法软件实例;

/**
 * @author lcl100
 * @create 2021-07-18 12:11
 * @desc 非终结表达式角色，减法表达式
 */
public class Minus extends AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    int interpret(Context context) {
        return left.interpret(context)-right.interpret(context);
    }

    @Override
    public String toString() {
        return "("+left.toString()+"-"+right.toString()+")";
    }
}
