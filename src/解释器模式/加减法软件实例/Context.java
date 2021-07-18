package 解释器模式.加减法软件实例;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lcl100
 * @create 2021-07-18 12:13
 * @desc 环境类
 */
public class Context {
    /**
     * 存储表达式和及其对应的值的映射关系，例如：a=1、b=2
     */
    private Map<Variable, Integer> map = new HashMap<>();

    /**
     * 为指定表达式赋值
     * @param var 指定表达式
     * @param value 待赋予的值
     */
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        return map.get(var);
    }
}
