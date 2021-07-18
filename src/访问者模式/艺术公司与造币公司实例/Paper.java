package 访问者模式.艺术公司与造币公司实例;

/**
 * @author lcl100
 * @create 2021-07-17 23:
 * @desc 具体元素类，纸
 */
public class Paper implements Material{
    @Override
    public String accept(Company visitor) {
        // 让指定访问者visitor访问当前Paper元素
        return visitor.create(this);
    }
}
