package 命令模式;

/**
 * @author lcl100
 * @create 2021-07-13 21:
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        Breakfast changFen = new ChangFen();
        Breakfast hunTun = new HunTun();
        Breakfast heFen = new HeFen();
        Waiter waiter = new Waiter();
        waiter.setChangFen(changFen);
        waiter.setHunTun(hunTun);
        waiter.setHeFen(heFen);

        waiter.chooseChangFen();// 选择吃肠粉
        waiter.chooseHunTun();// 选择吃馄饨
        waiter.chooseHeFen();// 选择吃河粉
    }
}
