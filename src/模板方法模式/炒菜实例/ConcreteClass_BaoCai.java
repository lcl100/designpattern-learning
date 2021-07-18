package 模板方法模式.炒菜实例;

/**
 * @author lcl100
 * @create 2021-07-12 21:49
 * @desc 炒包菜类
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的佐料是青椒");
    }
}
