package 享元模式;

/**
 * @author lcl100
 * @create 2021-07-11 11:54
 * @desc O图形类(具体享元角色)
 */
public class OBox extends AbstractBox {
    @Override
    public String getShape() {
        return "O";
    }
}
