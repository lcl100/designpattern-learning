package 命令模式;

/**
 * @author lcl100
 * @create 2021-07-13 21:30
 * @desc 具体命令，河粉
 */
public class HeFen implements Breakfast {

    private HeFenChef receiver;

    HeFen() {
        receiver = new HeFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
