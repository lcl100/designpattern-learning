package 访问者模式.艺术公司与造币公司实例;

/**
 * @author lcl100
 * @create 2021-07-17 23:30
 * @desc 具体访问者，造币公司
 */
public class MintCompany implements Company {
    @Override
    public String create(Paper element) {
        // 造币公司利用Paper元素造纸币
        return "纸币";
    }

    @Override
    public String create(Cuprum element) {
        // 造币公司利用Cuprum元素造铜币
        return "铜币";
    }
}
