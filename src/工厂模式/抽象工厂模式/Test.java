package 工厂模式.抽象工厂模式;

/**
 * @author lcl100
 * @create 2021-07-05 23:44
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建的是意大利风味甜品工厂对象
        ItalyDessertFactory factory = new ItalyDessertFactory();
        // 获取拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        // 打印结果
        System.out.println(coffee.getName());
        dessert.show();
    }
}
