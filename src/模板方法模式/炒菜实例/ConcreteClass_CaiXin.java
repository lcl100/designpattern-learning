package 模板方法模式.炒菜实例;

/**
 * @author lcl100
 * @create 2021-07-12 21:48
 * @desc 炒菜心类
 */
public class ConcreteClass_CaiXin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的佐料是蒜");
    }
}
