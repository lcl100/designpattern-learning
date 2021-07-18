package 解释器模式.加减法软件实例;

/**
 * @author lcl100
 * @create 2021-07-18 12:07
 * @desc 终结符表达式角色
 */
public class Value extends AbstractExpression {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
