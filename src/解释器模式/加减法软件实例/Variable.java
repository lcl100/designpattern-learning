package 解释器模式.加减法软件实例;

/**
 * @author lcl100
 * @create 2021-07-18 12:08
 * @desc 终结符表达式，变量表达式
 */
public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
