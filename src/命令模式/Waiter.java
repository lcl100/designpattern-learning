package 命令模式;

/**
 * @author lcl100
 * @create 2021-07-13 21:32
 * @desc 调用者，服务员类
 */
public class Waiter {
    private Breakfast changFen;
    private Breakfast hunTun;
    private Breakfast heFen;

    public void setChangFen(Breakfast changFen) {
        this.changFen = changFen;
    }

    public void setHunTun(Breakfast hunTun) {
        this.hunTun = hunTun;
    }

    public void setHeFen(Breakfast heFen) {
        this.heFen = heFen;
    }

    // 烹饪肠粉
    public void chooseChangFen() {
        changFen.cooking();
    }

    // 烹饪馄饨
    public void chooseHunTun() {
        hunTun.cooking();
    }

    // 烹饪河粉
    public void chooseHeFen() {
        heFen.cooking();
    }
}
