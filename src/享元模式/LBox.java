package 享元模式;

/**
 * @author lcl100
 * @create 2021-07-11 11:53
 * @desc L图形类(具体享元角色)
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }
}
