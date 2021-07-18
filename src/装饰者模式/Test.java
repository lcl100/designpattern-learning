package 装饰者模式;

/**
 * @author lcl100
 * @create 2021-07-10 18:07
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 点一份炒面
        FastFood fastFood = new FriedNoodles();
        System.out.println(fastFood.getDesc() + " " + fastFood.cost() + "元");

        System.out.println("================");

        // 在炒面中添加一个鸡蛋
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + " " + fastFood.cost() + "元");

        System.out.println("================");

        // 再添加一个培根
        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc() + " " + fastFood.cost() + "元");

        System.out.println("================");

        // 再添加一个鸡蛋
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + " " + fastFood.cost() + "元");
    }
}
