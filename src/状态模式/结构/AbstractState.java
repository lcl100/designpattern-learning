package 状态模式.结构;

/**
 * @author lcl100
 * @create 2021-07-15 22:06
 * @desc 抽象状态类
 */
public abstract class AbstractState {
    /**
     * 封装环境对象中的特定状态所对应的行为
     * @param context 环境状态
     */
    abstract void Handle(Context context);
}
