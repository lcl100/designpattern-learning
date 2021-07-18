package 模板方法模式.炒菜实例;

/**
 * @author lcl100
 * @create 2021-07-12 21:41
 * @desc 抽象类，定义模板方法和基本方法
 */
public abstract class AbstractClass {
    // 定义唯一一个模板方法，定义了基本方法的执行流程，因为执行流程是固定的不应该被修改，所以使用final修饰
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    // 第一步，倒油
    public void pourOil() {
        System.out.println("倒油");
    }

    // 第二步，热油，直接实现该方法
    public void heatOil() {
        System.out.println("热油");
    }

    // 第三步，倒素菜，这是不一样的，一个是下包菜，一个是下菜心，需要用户自己实现，抽象方法
    public abstract void pourVegetable();

    // 第四步，倒调味料，这也是不一样的，抽象方法
    public abstract void pourSauce();

    // 第五步，翻炒
    public void fry() {
        System.out.println("翻炒至熟");
    }
}
