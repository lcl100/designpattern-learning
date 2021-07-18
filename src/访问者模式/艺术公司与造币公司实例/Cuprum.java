package 访问者模式.艺术公司与造币公司实例;

/**
 * @author lcl100
 * @create 2021-07-17 23:35
 * @desc 具体元素，铜
 */
public class Cuprum implements Material {
    @Override
    public String accept(Company visitor) {
        // 让指定访问者visitor访问当前Cuprum元素
        return visitor.create(this);
    }
}
