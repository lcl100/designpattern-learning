package 命令模式;

/**
 * @author lcl100
 * @create 2021-07-13 21:27
 * @desc 具体命令，肠粉
 */
public class ChangFen implements Breakfast {
    private ChangFenChef receiver;

    ChangFen() {
        receiver = new ChangFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
