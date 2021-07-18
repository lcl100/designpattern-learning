package 中介者模式.租房实例;

/**
 * @author lcl100
 * @create 2021-07-17 12:01
 * @desc 抽象同事类
 */
public abstract class Person {
    protected String name;// 人的姓名
    protected Mediator mediator;// 中介机构

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
