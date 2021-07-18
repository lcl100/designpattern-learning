package 命令模式;

/**
 * @author lcl100
 * @create 2021-07-13 21:29
 * @desc 具体命令，馄饨
 */
public class HunTun implements Breakfast{
    private HunTunChef receiver;

    HunTun(){
        receiver=new HunTunChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
