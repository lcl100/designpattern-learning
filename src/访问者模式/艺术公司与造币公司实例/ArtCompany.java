package 访问者模式.艺术公司与造币公司实例;

/**
 * @author lcl100
 * @create 2021-07-17 23:27
 * @desc 具体访问者，艺术公司
 */
public class ArtCompany implements Company{
    @Override
    public String create(Paper element) {
        // 艺术公司利用Paper元素操作
        return "打印广告";
    }

    @Override
    public String create(Cuprum element) {
        // 艺术公司利用Cuprum元素制造铜像
        return "孔子铜像";
    }
}
